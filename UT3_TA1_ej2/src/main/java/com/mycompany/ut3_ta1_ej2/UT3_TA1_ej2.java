/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

/**
 *
 * @author PSARAVIA
 */
public class UT3_TA1_ej2 {

    static Almacen almacen = new Almacen("El Geant");
    static Producto producto1 = new Producto("Galletitas", 50, "A", 100);
    static Producto producto2 = new Producto("Papitas", 70, "B", 200);
    static Producto producto3 = new Producto("Alfajores", 120, "C", 300);
    static Producto producto4 = new Producto("Cereales", 60, "D", 400);

    public static void main(String[] args) {
        System.out.println("Agrego Producto2");
        almacen.agregarProducto(producto2);
        almacen.imprimirStock();
        System.out.println("Agrego Producto4");
        almacen.agregarProducto(producto4);
        almacen.imprimirStock();
        System.out.println("Agrego Producto3");
        almacen.agregarProducto(producto3);
        almacen.imprimirStock();
        System.out.println("Agrego Producto1");
        almacen.agregarProducto(producto1);
        almacen.imprimirStock();

        System.out.println("\nStock inicial");
        almacen.imprimirStock();
        System.out.println("\nAgregar 50 stock a Etiqueta A");
        almacen.aumentarStock("A", 50);
        almacen.imprimirStock();
        System.out.println("\nRestar 100 stock a Etiqueta B");
        almacen.reducirStock("B", 100);
        almacen.imprimirStock();
        System.out.println("\nRestar 1000 stock a Etiqueta B");
        almacen.reducirStock("B", 1000);
        almacen.imprimirStock();
    }
}
