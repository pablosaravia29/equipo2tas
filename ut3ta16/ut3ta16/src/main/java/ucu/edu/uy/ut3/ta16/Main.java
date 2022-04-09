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
        ILista<Pelicula> peliculas = productora.obtenerPeliculasDelParticipante("12");
        ILista<Participante> participantesPeli = productora.obtenerParticipantesPelicula("1278");
        
    }

}
