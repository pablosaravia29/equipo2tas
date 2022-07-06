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
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(null);
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
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.inOrden();
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
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.vaciar();
        assertEquals(expResult, result);
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
    public void testNivel() {
        System.out.println("nivel");
        Comparable etiqueta = null;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.nivel(etiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        TArbolBB instance = new TArbolBB();
        IElementoAB expResult = null;
        IElementoAB result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcularCosto() {
        System.out.println("calcularCosto");
        int[] frecExito = null;
        int[] frecNoExito = null;
        TArbolBB instance = new TArbolBB();
        long expResult = 0L;
        long result = instance.calcularCosto(frecExito, frecNoExito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testListaDatosNivelMasProfundo() {
        System.out.println("listaDatosNivelMasProfundo");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.listaDatosNivelMasProfundo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIti() {
        System.out.println("Iti");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.Iti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCuentaFrec() {
        System.out.println("cuentaFrec");
        TArbolBB instance = new TArbolBB();
        instance.cuentaFrec(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCompletaVectores() {
        System.out.println("completaVectores");
        Comparable[] claves = null;
        int[] freExito = null;
        int[] frecNoExito = null;
        TArbolBB instance = new TArbolBB();
        instance.completaVectores(claves, freExito, frecNoExito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCumpleAVL() {
        System.out.println("cumpleAVL");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.cumpleAVL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testParesPalabra() {
        System.out.println("paresPalabra");
        Comparable palabra = null;
        TArbolBB instance = new TArbolBB();
        Lista<Integer> expResult = null;
        Lista<Integer> result = instance.paresPalabra(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
