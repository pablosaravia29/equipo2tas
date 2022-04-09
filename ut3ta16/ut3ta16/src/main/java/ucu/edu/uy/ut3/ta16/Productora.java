/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

import ucu.edu.uy.tda.ILista;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.ListaOrdenada;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

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
        
    }

    public ILista<Participante> obtenerParticipantesPelicula(Comparable idPelicula)
    {
        // Implementar método
    }

    public ILista<Pelicula> obtenerPeliculasDelParticipante(Comparable idParticipante)
    {
        
        // Implementar método
    }
}
