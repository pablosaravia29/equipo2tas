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
       // geant.imprimirProductos();

        //emitir el valor del stock
        // simular las ventas a partir del archivo "ventaspruebas.txt"
        // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
        // listar los productos ordenados por codigo, junto con su cantidad existente
    }
}