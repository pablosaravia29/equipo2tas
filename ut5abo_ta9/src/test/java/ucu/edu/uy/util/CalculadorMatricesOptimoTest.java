/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ucu.edu.uy.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.uy.tda.IArbolBB;

/**
 *
 * @author FIT
 */
public class CalculadorMatricesOptimoTest {
    
    public CalculadorMatricesOptimoTest() {
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
    public void testEncontrarOptimo() {
        System.out.println("encontrarOptimo");
        int cantElem = 0;
        int[] frecExito = null;
        int[] frecNoExito = null;
        CalculadorMatricesOptimo instance = null;
        instance.encontrarOptimo(cantElem, frecExito, frecNoExito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testArmarArbolBinario() {
        System.out.println("armarArbolBinario");
        int i = 0;
        int j = 0;
        String[] Claves = null;
        IArbolBB elArbolBB = null;
        CalculadorMatricesOptimo instance = null;
        instance.armarArbolBinario(i, j, Claves, elArbolBB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testImprimirMatriz() {
        System.out.println("imprimirMatriz");
        int[][] matriz = null;
        CalculadorMatricesOptimo.imprimirMatriz(matriz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintR() {
        System.out.println("printR");
        CalculadorMatricesOptimo instance = null;
        instance.printR();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintW() {
        System.out.println("printW");
        CalculadorMatricesOptimo instance = null;
        instance.printW();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintP() {
        System.out.println("printP");
        CalculadorMatricesOptimo instance = null;
        instance.printP();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
