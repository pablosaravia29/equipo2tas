/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ucu.edu.uy.tda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class TArbolBBTest {
    private TArbolBB arbolResultado;
    
    public TArbolBBTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        arbolResultado = new TArbolBB();
        TElementoAB elem1 = new TElementoAB("hola", "1");
        TElementoAB elem2 = new TElementoAB("chau", "2");
        TElementoAB elem3 = new TElementoAB("zzzz", "3");
        /*TElementoAB elem4 = new TElementoAB("4", "4");
        TElementoAB elem5 = new TElementoAB("5", "5", 31);*/

        arbolResultado.insertar(elem1);
        arbolResultado.insertar(elem2);      
        arbolResultado.insertar(elem3);
        
        Lista<Integer> lista1 = new Lista<Integer> ();
        Lista<Integer> lista2 = new Lista<Integer> ();
        Lista<Integer> lista3 = new Lista<Integer> ();
        
        Nodo nodo1 = new Nodo ("1",1);
        Nodo nodo2 = new Nodo ("2",2);
        Nodo nodo4 = new Nodo ("4",4);
        Nodo nodo6 = new Nodo ("6",6);
        Nodo nodo8 = new Nodo ("8",8);
        Nodo nodo10 = new Nodo ("10",10);
        
        lista1.insertar(nodo1);
        lista1.insertar(nodo2);
        lista1.insertar(nodo4);
        
        lista2.insertar(nodo8);
        lista2.insertar(nodo10);
        
        lista3.insertar(nodo8);
        lista3.insertar(nodo6);
        lista3.insertar(nodo2);
        
        elem1.setListaEnteros(lista1);
        elem2.setListaEnteros(lista2);
        elem3.setListaEnteros(lista3);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testParesPalabra() {
        this.setUp();
        Lista<Integer> listaresult = arbolResultado.paresPalabra("chau");
        int resultadoObtenido = listaresult.cantElementos();
        int resultadoEsperado = 4;                       
        assertEquals(resultadoEsperado, resultadoObtenido);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
