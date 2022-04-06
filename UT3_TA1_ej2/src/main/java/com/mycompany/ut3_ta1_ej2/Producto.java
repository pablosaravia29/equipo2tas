/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

public class Producto implements IProducto {

    private String nombre;
    private int precio;
    private int codigo;
    private int stock;

    public Producto(int codigo, String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
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

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String imprimirStock() {
        String stock = Integer.toString(this.getStock());
        return ("El Stock de " + this.getNombre()+ " es: " + stock);
    }

    @Override
    public String toString() {
        String price = Integer.toString(this.precio);
        String stock = Integer.toString(this.getStock());
        String code = Integer.toString(this.getCodigo());
        return ("Etiqueta: " + code + " || Nombre : " + this.nombre + " || Precio : " + price + " || Stock : " + stock);
    }

    @Override
    public void setSiguiente(IProducto Producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IProducto getSiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarStock(int stock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int restarStock(int stock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
