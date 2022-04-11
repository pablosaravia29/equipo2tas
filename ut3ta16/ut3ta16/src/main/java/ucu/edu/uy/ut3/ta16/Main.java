package ucu.edu.uy.ut3.ta16;
import ucu.edu.uy.tda.*;

public class Main
{
    public static final String ARCHIVO_PELIS = "C:\\Java\\NetBeansProjects\\AED1\\equipo2tas\\ut3ta16\\ut3ta16\\PeliculasTest.csv";
    public static final String ARCHIVO_PERSONAS = "C:\\Java\\NetBeansProjects\\AED1\\equipo2tas\\ut3ta16\\ut3ta16\\PersonasTest.csv";
    public static final String ARCHIVO_PERSONAS_EN_PELIS = "C:\\Java\\NetBeansProjects\\AED1\\equipo2tas\\ut3ta16\\ut3ta16\\PersParticipaPeliTest.csv";

    public static void main(String[] args)
    {

        Productora productora = new Productora();
        productora.cargarPeliculas(ARCHIVO_PELIS);
        productora.cargarParticipantes(ARCHIVO_PERSONAS);
        productora.cargarPersonasQueParticipanEnPeliculas(ARCHIVO_PERSONAS_EN_PELIS);
        
        ILista<Pelicula> peliculas = productora.obtenerPeliculasDelParticipante(0);       
        
        productora.imprimirPeliculasDelParticipante(peliculas);
                
        ILista<Participante> participantesPeli = productora.obtenerParticipantesPelicula("780");
        productora.imprimirParticipantesDePelicula(participantesPeli);
    }
}
