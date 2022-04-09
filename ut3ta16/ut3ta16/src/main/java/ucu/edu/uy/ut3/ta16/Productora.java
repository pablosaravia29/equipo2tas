/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

import ucu.edu.uy.tda.ILista;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.ListaOrdenada;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author nnavarro
 */
public class Productora
{

    public static final String ARCHIVO_PELIS = "peliculas.csv";
    public static final String ARCHIVO_PERSONAS = "personas.csv";
    public static final String ARCHIVO_PERSONAS_EN_PELIS = "pers_participa_peli.csv";
    public ILista<Participante> participantes = new Lista<>();
    public ILista<Pelicula> peliculas = new Lista<>();

    // cargar datos con declaraciones try y catch
    public void cargarDatos() {
        ManejadorArchivosGenerico manejadorArchivos = new ManejadorArchivosGenerico();

        String[] lineasArchivo = manejadorArchivos.leerArchivo(ARCHIVO_PELIS);

        for (String linea : lineasArchivo) {
            String[] pelis = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            try {
            Pelicula nuevaPelicula = new Pelicula (parseInt(pelis[0]),pelis[1],parseInt(pelis[2]),parseInt(pelis[3]),pelis[4],pelis[5]);
            Nodo <Pelicula> peliculaAInsertar = new Nodo<> (pelis[0], nuevaPelicula);
                peliculas.insertar(peliculaAInsertar);
            } catch (Exception e) {
                System.out.println("Error al insertar pelicula: " + e.getMessage());
            }
        }

        // cargar datos de personas
        String[] lineasArchivo2 = manejadorArchivos.leerArchivo(ARCHIVO_PERSONAS);

        for(String linea : lineasArchivo2){
            String[] personas = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            try {
                Participante nuevoParticipante = new Participante(parseInt(personas[0]),personas[1]);
                Nodo<Participante> participanteAInsertar = new Nodo<>(personas[0], nuevoParticipante);
                participantes.insertar(participanteAInsertar);
            } catch (Exception e) {
                System.out.println("Error al insertar participante: " + e.getMessage());
            }
        }

        // cargar datos de personas en peliculas
        String[] lineasArchivo3 = manejadorArchivos.leerArchivo(ARCHIVO_PERSONAS_EN_PELIS);

        for(String linea : lineasArchivo3){
            String[] personasEnPelis = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            try {
                Nodo<Pelicula> nodoPelicula = peliculas.buscar(parseInt(personasEnPelis[1]));
                if(nodoPelicula != null){
                    Pelicula peliculaEncontrada = (Pelicula) nodoPelicula.getDato();
                    Nodo<Participante> nodoParticipante = participantes.buscar(parseInt(personasEnPelis[0]));
                    if(nodoParticipante != null){
                        peliculaEncontrada.getListaParticipantes().insertar(nodoParticipante);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error al insertar participante en pelicula: " + e.getMessage());
            }
        }

    }

    public ILista<Participante> obtenerParticipantesPelicula(Comparable idPelicula)
    {
        ILista<Participante> listaResultado = new Lista<>();
        INodo<Pelicula> pelicula = peliculas.buscar(idPelicula);
        if (pelicula != null)
        {
            Pelicula peli = (Pelicula) pelicula.getDato();
            Nodo<Participante> participante = peli.getListaParticipantes().getPrimero();
            while (participante != null)
            {
                Nodo<Participante> participanteAInsertar = participante;
                listaResultado.insertar(participanteAInsertar);
                participante = participante.getSiguiente();
            }
        }
        return listaResultado;
    }

    // obtener peliculas del participante
    public ILista<Pelicula> obtenerPeliculasDelParticipante(Comparable idParticipante)
    {
        Nodo<Pelicula> nodoPelicula = peliculas.getPrimero();
        ILista<Pelicula> listaResultado = new Lista<>();
        while (nodoPelicula != null)
        {
            Pelicula pelicula = (Pelicula) nodoPelicula.getDato();
            Nodo<Participante> nodoParticipante = pelicula.getListaParticipantes().buscar(idParticipante);
            if (nodoParticipante != null)
            {
                Nodo<Pelicula> temp = nodoPelicula;
                listaResultado.insertar(temp);
            }
            nodoPelicula = nodoPelicula.getSiguiente();
        }
        return listaResultado;
    }
}
