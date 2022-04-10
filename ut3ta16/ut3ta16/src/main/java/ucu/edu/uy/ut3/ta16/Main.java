package ucu.edu.uy.ut3.ta16;

/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */


import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.*;
/**
 *
 * @author nnavarro
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Productora productora = new Productora();
        productora.cargarDatos();
        /*
        ILista<Pelicula> peliculas = productora.obtenerPeliculasDelParticipante("0");
        INodo<Pelicula> nodoPelicula = peliculas.getPrimero();
        while(nodoPelicula != null){
            System.out.println("AAAAAAAAAAAAAAAAAAA");
            Pelicula pelicula = (Pelicula) nodoPelicula.getDato();
            pelicula.imprimir();
            nodoPelicula = nodoPelicula.getSiguiente();
        }
        if(nodoPelicula == null){
            System.out.println("No hay peliculas");
        }*/


        ILista<Participante> participantesPeli = productora.obtenerParticipantesPelicula("860");

        INodo<Participante> nodoParticipante = participantesPeli.getPrimero();

        while(nodoParticipante != null){
            System.out.println("AAAAAAAAAAAAAAAAAAA");
            Participante participante = (Participante) nodoParticipante.getDato();
            participante.imprimir();
            nodoParticipante = nodoParticipante.getSiguiente();
        }
        
    }

}
