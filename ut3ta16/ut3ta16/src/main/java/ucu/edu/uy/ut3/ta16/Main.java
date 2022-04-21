package ucu.edu.uy.ut3.ta16;
import ucu.edu.uy.tda.*;

public class Main
{
    public static final String ARCHIVO_PELIS = "peliculas.csv";
    public static final String ARCHIVO_PERSONAS = "personas.csv";
    public static final String ARCHIVO_PERSONAS_EN_PELIS = "pers_participa_peli.csv";

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
