/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

import ucu.edu.uy.tda.ILista;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author nnavarro
 */
public class Productora {

    public ILista<Participante> participantes = new Lista<>();
    public ILista<Pelicula> peliculas = new Lista<>();

    public void cargarPeliculas(String ruta) {
        ManejadorArchivosGenerico manejadorArchivos = new ManejadorArchivosGenerico();

        String[] lineasArchivo = manejadorArchivos.leerArchivo(ruta);
        for (String linea : lineasArchivo) {
            String[] pelis = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            try {
                Pelicula nuevaPelicula = new Pelicula(parseInt(pelis[0]), pelis[1], parseInt(pelis[2]), parseInt(pelis[3]), pelis[4], pelis[5]);
                Nodo<Pelicula> peliculaAInsertar = new Nodo<>(pelis[0], nuevaPelicula);
                peliculas.insertar(peliculaAInsertar);
            } catch (Exception e) {
                System.out.println("Error al insertar pelicula: " + e.getMessage());
            }
        }
    }

    public void cargarParticipantes(String ruta) {

        ManejadorArchivosGenerico manejadorArchivos = new ManejadorArchivosGenerico();

        String[] lineasArchivo2 = manejadorArchivos.leerArchivo(ruta);
        for (String linea : lineasArchivo2) {
            String[] personas = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            try {
                Participante nuevoParticipante = new Participante(parseInt(personas[0]), personas[1]);
                Nodo<Participante> participanteAInsertar = new Nodo<>(personas[0], nuevoParticipante);
                participantes.insertar(participanteAInsertar);
            } catch (Exception e) {
                System.out.println("Error al insertar participante: " + e.getMessage());
            }
        }
    }

    public void cargarPersonasQueParticipanEnPeliculas(String ruta) {

        ManejadorArchivosGenerico manejadorArchivos = new ManejadorArchivosGenerico();

        String[] lineasArchivo3 = manejadorArchivos.leerArchivo(ruta);
        for (String linea : lineasArchivo3) {
            String[] personasEnPelis = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            try {
                Nodo<Pelicula> nodoPelicula = peliculas.buscar(parseInt(personasEnPelis[1]));
                if (nodoPelicula != null) {
                    Pelicula peliculaEncontrada = nodoPelicula.getDato();
                    Nodo<Participante> nodoParticipante = participantes.buscar(parseInt(personasEnPelis[0]));
                    if (nodoParticipante != null) {
                        peliculaEncontrada.getListaParticipantes().insertar(nodoParticipante.clonar());
                    }
                }
            } catch (Exception e) {
                System.out.println("Error al insertar participante en pelicula: " + e.getMessage());
            }
        }
    }

    // obtengo una lista de participantes que participan en una pelicula
    public ILista<Participante> obtenerParticipantesPelicula(Comparable idPelicula) {
        ILista<Participante> listaResultado = new Lista<>();
        INodo<Pelicula> pelicula = peliculas.buscar(idPelicula);
        if (pelicula != null) {
            Pelicula peli = (Pelicula) pelicula.getDato();
            Nodo<Participante> participante = peli.getListaParticipantes().getPrimero();
            while (participante != null) {
                //Nodo<Participante> participanteAInsertar = new Nodo<>(participante.getDato().getId(), participante.getDato());
                listaResultado.insertar(participante.clonar());
                participante = participante.getSiguiente();
            }
        }
        return listaResultado;
    }

    // obtengo una lista de peliculas actuadas por un mismo participante
    public ILista<Pelicula> obtenerPeliculasDelParticipante(Comparable idParticipante) {

        Nodo<Pelicula> nodoPelicula = peliculas.getPrimero();
        ILista<Pelicula> listaResultado = new ListaOrdenada<>();
        while (nodoPelicula != null) {
            Pelicula pelicula = nodoPelicula.getDato();
            Nodo<Participante> nodoParticipante = pelicula.getListaParticipantes().buscar(idParticipante);
            if (nodoParticipante != null) {
                //Nodo<Pelicula> peliculaAInsertar = new Nodo<Pelicula>(pelicula.getNombre(), pelicula);
                listaResultado.insertar(nodoPelicula.clonar());
            }
            nodoPelicula = nodoPelicula.getSiguiente();
        }
        
        return listaResultado;
    }

    public void imprimirPeliculasDelParticipante(ILista<Pelicula> peliculasImprimir) {

        INodo<Pelicula> nodoPelicula = peliculasImprimir.getPrimero();
        while (nodoPelicula != null) {
            nodoPelicula.getDato().imprimir();
            nodoPelicula = nodoPelicula.getSiguiente();
        }
    }

    public void imprimirParticipantesDePelicula(ILista<Participante> participantesImprimir) {
        INodo<Participante> nodoParticipante = participantesImprimir.getPrimero();
        while (nodoParticipante != null) {
            nodoParticipante.getDato().imprimir();
            nodoParticipante = nodoParticipante.getSiguiente();
        }
    }

}
