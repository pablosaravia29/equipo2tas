package ucu.edu.uy.ta92022;

import ucu.edu.uy.tda.TArbolBB;

public class Main {

    /**
     * @param args
     */
    static Almacen geant = new Almacen("Geant");

    public static void main(String[] args) {

        //  TArbolBB arbol = new TArbolBB();
        // cargar los productos desde el archivo "altasprueba.txt"
        geant.procesarArchivoAltas("altasPrueba.txt");

        // listar los productos ordenados por codigo, junto con su cantidad existente
        geant.imprimirProductos();

        //emitir el valor del stock
        // simular las ventas a partir del archivo "ventaspruebas.txt"
        geant.procesarArchivoVentas("ventasPrueba.txt");

        geant.imprimirProductos();

        // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
        geant.procesarArchivoEliminar("elimPrueba.txt");

        // listar los productos ordenados por codigo, junto con su cantidad existente
        geant.imprimirProductos();

        geant.listarProductosEnArchivo();
        Producto prod = geant.buscarPorCodigo(1000097);
        if (prod != null) {
            System.out.println("Producto encontrado: ");

            System.out.println(prod.toString());

        } else {
            System.out.println("Producto no encontrado...");
        }

    }
}
