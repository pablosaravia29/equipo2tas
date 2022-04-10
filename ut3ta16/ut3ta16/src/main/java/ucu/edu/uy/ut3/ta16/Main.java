package ucu.edu.uy.ut3.ta16;

/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */


import ucu.edu.uy.tda.*;

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
        
        Nodo<Pelicula> pelicula = productora.peliculas.buscar(50);
        System.out.println(pelicula == null);
        
        ILista<Pelicula> peliculas = productora.obtenerPeliculasDelParticipante(0);
        INodo<Pelicula> nodoPelicula = peliculas.getPrimero();
        while (nodoPelicula != null) {
            nodoPelicula.getDato().imprimir();
            nodoPelicula = nodoPelicula.getSiguiente();
        }
        

        /*
        
        ILista<Participante> participantesPeli = productora.obtenerParticipantesPelicula("780");
        INodo<Participante> nodoParticipante = participantesPeli.getPrimero();
        while(nodoParticipante != null){
            nodoParticipante.getDato().imprimir();
            nodoParticipante = nodoParticipante.getSiguiente();
        }
        */
    }
}
