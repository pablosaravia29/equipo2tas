package ucu.edu.uy.ut3.ta16;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.ut3.ta16.*;

/**
 *
 * @author nnavarro
 */
public class ProductoraTest
{
    public Productora productora;

    public Participante p1;
    public Participante p2;
    public Participante p3;
    public Participante p4;
    public Participante p5;    
    public Participante p6;

    public Lista<Participante> lista;
    public Pelicula peli1;
    public Pelicula peli2;
    public Pelicula peli3;
    public Pelicula peli4;
    public Pelicula peli5;

    public Lista<Pelicula> listaPeliculasDeParticipante1;
    
    public ProductoraTest()
    {

    }
    
    @BeforeAll
    public static void setUpClass()
    {

    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp(){
        productora = new Productora();

        lista = new Lista<Participante>();

        p1 = new Participante(0,"Bill Paterson");
        p2 = new Participante(1,"Guillermo Navarro");
        p3 = new Participante(2, "Diana Lin");
        p4 = new Participante(3, "Mckenna Grace");
        p5 = new Participante(4, "Steven Yeun");
        p6 = new Participante(5,"Michael Dorman");

        peli1 = new Pelicula(84,"Henry V",1989,100,"Action & Adventure","English");
        peli2 = new Pelicula(849,"Kiki's Delivery Service",1989,98,"Kids & Family","Japanese");
        peli3 = new Pelicula(860,"The Little Mermaid",1989,93,"Kids & Family","English");
        peli4 = new Pelicula(781,"Arachnophobia",1990,93,"Horror","English");
        peli5 = new Pelicula(1162,"Say Anything...",1989,98,"Romance","English");

        listaPeliculasDeParticipante1 = new Lista<Pelicula>();

    }
    
    @AfterEach
    public void tearDown()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void obtenerParticipantesPeliculaTest(){
        productora.cargarParticipantes("PersonasTest.csv");
        productora.obtenerParticipantesPelicula(84);
        assertEquals(0, p1.getId());
    }

    // test de cargarDatos
    @Test
    public void cargarDatosTest()
    {
    }

    // test peliculas de un participante por id
    @Test
    public void obtenerPeliculasDelParticipanteTest()
    {
        ILista<Pelicula> peliculas = productora.obtenerPeliculasDelParticipante("0");
        INodo<Pelicula> nodoPelicula = peliculas.getPrimero();
        while (nodoPelicula != null)
        {
            nodoPelicula.getDato().imprimir();
            nodoPelicula = nodoPelicula.getSiguiente();
        }
    }
}