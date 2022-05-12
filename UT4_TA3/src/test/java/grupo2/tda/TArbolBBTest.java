/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package grupo2.tda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author FIT
 */
public class TArbolBBTest {

   static TArbolBB<Integer> arbol1;
    TArbolBB<IElementoAB> arbol2;
    TArbolBB<IElementoAB> arbol3;

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
        arbol1 = new TArbolBB<Integer>();
        arbol2 = new TArbolBB<IElementoAB>();
        arbol3 = new TArbolBB<IElementoAB>();

        arbol1.insertar(new TElementoBB<>("asdadsadads", 1));
        arbol1.insertar(new TElementoBB<>(" asdads", 2));
        arbol1.insertar(new TElementoBB<>("Hola",5));
//        arbol1.insertar(new TElementoBB(4,8));
//        arbol1.insertar(new TElementoBB(5,10));

//        arbol2.insertar(new TElementoBB(1,2));
//        arbol2.insertar(new TElementoBB(2,4));
//        arbol2.insertar(new TElementoBB(3,5));
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInsertar() {
        System.out.println("insertar");
        setUp();
        int tamanioEsperado = 4;
        IElementoAB<Integer> unElemento = new TElementoBB<Integer>("198798", 81);
        boolean a = arbol1.insertar(unElemento);
        int tamanioFinal = arbol1.tamanio();
        assertEquals(tamanioEsperado, tamanioFinal);
    }
//
//        IElementoAB unElemento = null;
//        TArbolBB instance = new TArbolBB();
//        boolean expResult = false;
//        boolean result = instance.insertar(unElemento);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

    @Test
    public void testInorden() {
        System.out.println("inorden");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.inorden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        instance.eliminar(unaEtiqueta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAltura() {
        System.out.println("altura");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.altura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTamanio() {
        System.out.println("tamanio");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.tamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCantHojas() {
        System.out.println("cantHojas");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.cantHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
