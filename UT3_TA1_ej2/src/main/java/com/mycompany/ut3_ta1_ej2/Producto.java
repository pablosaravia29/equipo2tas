/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

public class Producto {

    private String nombre;
    private int precio;
    private Comparable etiqueta;
    private int stock;

    public Producto(String nombre, int precio, Comparable etiqueta, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.etiqueta = etiqueta;
        this.stock = stock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public void setEtiqueta(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        String price = Integer.toString(this.precio);
        String stock = Integer.toString(this.getStock());
        return ("Etiqueta: " + this.etiqueta.toString() + " || Nombre : " + this.nombre + " || Precio : " + price + " || Stock : " + stock);
    }
}
