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
public class TLista <T> {

    private TNodo<T> primero = null;

    public TNodo<T> getPrimero() {
        return this.primero;
    }

    public void insertar(TNodo<T> nodo) {
        if (esVacio()) {
            primero = nodo;
        } else {
            nodo.setSiguiente(primero);
            primero = nodo;
        }
    }

    public void insertarAlFinal(TNodo<T> nodo) {
        TNodo aux = primero;
        if (esVacio()) {
            primero = nodo;
        } else {

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
    }

    public boolean esVacio() {
        return this.primero == null;
    }

    public TNodo<T> buscar(Comparable etiqueta) {
        TNodo<T> aux = primero;
        while (aux != null) {
            if (aux.getEtiqueta() == etiqueta) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public void insertarOrdenado(TNodo<T> nodo) {
        if (esVacio()) {
            insertar(nodo);
            return;
        }
        TNodo actual = primero;
        TNodo siguiente = primero.getSiguiente();
        if (actual.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
            primero = nodo;
            nodo.setSiguiente(actual);
            return;
        }
        while (siguiente != null) {
            if (actual.getEtiqueta().compareTo(nodo.getEtiqueta()) < 0 && siguiente.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
                actual.setSiguiente(nodo);
                nodo.setSiguiente(siguiente);
                return;
            }
            actual = siguiente;
            siguiente = siguiente.getSiguiente();
        }
        if (actual.getEtiqueta().compareTo(nodo.getEtiqueta()) < 0) {
            actual.setSiguiente(nodo);
        }
    }
}
