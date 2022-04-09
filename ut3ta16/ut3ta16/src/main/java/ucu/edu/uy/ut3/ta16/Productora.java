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

/**
 *
 * @author nnavarro
 */
public class Productora
{

    public static final String ARCHIVO_PELIS = "peliculas.csv";
    public static final String ARCHIVO_PERSONAS = "personas.csv";
    public static final String ARCHIVO_PERSONAS_EN_PELIS = "pers_participa_peli.csv";

    public ILista<Pelicula> peliculas = new Lista<>();

    public void cargarDatos()
    {
        ManejadorArchivosGenerico manejadorPeliculas = new ManejadorArchivosGenerico();
        ManejadorArchivosGenerico manejadorParticipantes = new ManejadorArchivosGenerico();
        ManejadorArchivosGenerico manejadorParticipantesEnPeliculas = new ManejadorArchivosGenerico();

        //cargar peliculas
        peliculas = manejadorPeliculas.leerArchivo(ARCHIVO_PELIS);
     //   ARCHIVO_PERSONAS
       //         ARCHIVO_PERSONAS_EN_PELIS

        //cargar participantes
        ILista<Participante> participantes = manejadorParticipantes.leerArchivo();

        //cargar participantes en peliculas
        ILista<ParticipanteEnPelicula> participantesEnPeliculas = manejadorParticipantesEnPeliculas.leerArchivo();

        //agregar participantes a peliculas
        for (Nodo<ParticipanteEnPelicula> nodo = participantesEnPeliculas.getPrimero(); nodo != null; nodo = nodo.getSiguiente())
        {
            Pelicula pelicula = peliculas.buscar(nodo.getDato().getIdPelicula());
            if (pelicula != null)
            {
                pelicula.agregarParticipante(participantes.buscar(nodo.getDato().getIdParticipante()));
            }
        }
    }

    public ILista<Participante> obtenerParticipantesPelicula(Comparable idPelicula)
    {
        ILista<Participante> listaResultado = new Lista<>();
        INodo<Pelicula> pelicula = listaPeliculas.buscar(idPelicula);
        if (pelicula != null)
        {
            Pelicula peli = (Pelicula) pelicula.getEtiqueta();
            INodo<Participante> participante = peli.getListaParticipantes().getPrimero();
            while (participante != null)
            {
                listaResultado.insertar(participante.getEtiqueta());
                participante = participante.getSiguiente();
            }
        }
        return listaResultado;
    }

    public ILista<Pelicula> obtenerPeliculasDelParticipante(Comparable idParticipante)
    {
     INodo nodoPelicula = peliculas.getPrimero();
     ILista <Pelicula> listaResultado = new ILista (); 
     while (nodoPelicula != null){
         if (nodoPelicula.buscar(idParticipante)){
             INodo temp = nodoPelicula;
             listaResultado.insertar(temp);
         }
     }
     return listaResultado;
    }
}
