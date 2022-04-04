/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

/**
 *
 * @author PSARAVIA
 * @param <T>
 */
public class TNodo <T> {

    private Comparable etiqueta;
    private TNodo siguiente = null;
    private T dato;

    public TNodo(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }

    public TNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(TNodo siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void imprimirDato() {
        System.out.println(dato.toString());
    }

    public void imprimirEtiqueta() {
        System.out.println(etiqueta.toString());
    }
}
