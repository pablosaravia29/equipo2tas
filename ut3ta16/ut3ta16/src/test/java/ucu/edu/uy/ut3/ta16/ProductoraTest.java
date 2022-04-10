/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
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
    private Productora productora = new Productora();

    Lista<Participante> lista = new Lista<Participante>();
    Participante p1 = new Participante(0, "Pablo");
    
    
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
        Productora productora = new Productora();
        productora.cargarDatos();


        Lista<Participante> lista = new Lista<Participante>();
        Participante p1 = new Participante(0, "Pablo");
        Participante p2 = new Participante(1, "Levi");
        Participante p3 = new Participante(2, "Alejandra");
        Participante p4 = new Participante(3, "Rafael");
        Participante p5 = new Participante(4, "Fabio");
        
        
        


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
        Nodo<Participante> nodoParticipante = new Nodo<Participante>(p1.getId(), p1);
        lista.insertar(nodoParticipante);
        Nodo<Participante> resultado = lista.buscar(0);
        System.out.println(resultado == null);
    }
    
    @Test
    public void obtenerPeliculasDelParticipanteTest(){

    }

    // test de cargarDatos
    @Test
    public void cargarDatosTest()
    {/*
        Productora productora = new Productora();
        productora.cargarDatos();
        assertEquals(productora.getParticipantes().getTamanio(), 5);
        assertEquals(productora.getPeliculas().getTamanio(), 5);*/
    }

    // test peliculas de un participante por id
    @Test
    public void obtenerPeliculasDelParticipanteTest2()
    {
        //Productora productora = new Productora();
        productora.cargarDatos();
        ILista<Pelicula> peliculas = productora.obtenerPeliculasDelParticipante("0");
        INodo<Pelicula> nodoPelicula = peliculas.getPrimero();
        while (nodoPelicula != null)
        {
            nodoPelicula.getDato().imprimir();
            nodoPelicula = nodoPelicula.getSiguiente();
        }
    }

}
