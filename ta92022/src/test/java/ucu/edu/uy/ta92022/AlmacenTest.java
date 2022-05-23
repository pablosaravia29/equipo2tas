/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ucu.edu.uy.ta92022;

import javax.sound.midi.InvalidMidiDataException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author FIT
 */
public class AlmacenTest {

    Almacen almacen = new Almacen("grant");
    private Producto p1;
    private Producto p2;
    private Producto p3;

//    private TElementoAB<Producto> elem1;
//    private TElementoAB<Producto> elem2;
//    private TElementoAB<Producto> elem3;

    public AlmacenTest() {

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        p1 = new Producto("1", "COLET 1 LT - CONAPROLE", 100, 200);
        p2 = new Producto("2", "MANTECA 100g - CONAPROLE", 200, 400);
        p3 = new Producto("1", "MANTECA 100g - CONAPROLE", 200, 400);
//        elem1 = new TElementoAB<>("1", p1);
//        elem2 = new TElementoAB<>("2", p2);
//        elem3 = new TElementoAB<>("2", p3);
    }

    @AfterEach
    public void tearDown() {
    }

    //Tests para insertarProducto
    @Test
    @DisplayName("Probar que ingesando producto con id ya existente no lo inserta y el stock del producto existente no se ve alterado")
    public void testInsertarProducto() {
        System.out.println("insertarProducto");
        setUp();
        almacen.insertarProducto(p1);
        almacen.insertarProducto(p3);
        assertEquals(200, almacen.buscarPorCodigo("1").getStock());

    }

    //Tests para RestarStock
    @Test
    @DisplayName("Probar que ingesando un stock menor al existente el stock se reduce acorde a lo restado")
    public void testRestarStock() {
        System.out.println("RestarStock");
        setUp();
        almacen.insertarProducto(p1);
        almacen.insertarProducto(p2);
        Integer resultado = almacen.restarStock("2", 150);
        assertEquals(250, almacen.buscarPorCodigo("2").getStock());

    }

    @Test
    @DisplayName("Probar que  restando un stock mayor al existente, el stock queda en cero")
    public void testRestarStockUnStockMayor() {
        System.out.println("RestarStock");
        setUp();
        almacen.insertarProducto(p1);
        almacen.insertarProducto(p2);
        Integer resultado = almacen.restarStock("2", 1000);
        assertEquals(0, almacen.buscarPorCodigo("2").getStock());

    }
    //Tests para BuscarPorCodigo

    @Test
    @DisplayName("Probar que ingesando un codigo existente se encuentra el producto")
    public void testBuscarPorCodigoExiste() {
        System.out.println("buscarPorCodigo");
        setUp();
        almacen.insertarProducto(p1);
        almacen.insertarProducto(p2);
        String resultado = almacen.buscarPorCodigo("2").getNombre();

        assertEquals("MANTECA 100g - CONAPROLE", resultado);

    }

    @Test
    @DisplayName("Probar que ingesando un codigo que NO existente retorna null")
    public void testBuscarPorCodigoNoExiste() {
        System.out.println("buscarPorCodigo");
        setUp();
        almacen.insertarProducto(p1);
        almacen.insertarProducto(p2);
        Producto resultado = almacen.buscarPorCodigo("3");
        assertNull(resultado);

    }

    //Tests para EliminarProducto
    @Test
    @DisplayName("Probar que eliminando un codigo  de Producto que existe en la almacen luego del metodo eliminar no lo encuentro")
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        setUp();
        almacen.insertarProducto(p1);
        almacen.insertarProducto(p2);
        almacen.eliminarProducto("2");
        Producto resultado = almacen.buscarPorCodigo("2");
        assertNull(resultado);
    }

}
