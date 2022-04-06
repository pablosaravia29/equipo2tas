/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

import java.util.HashSet;

/**
 *
 * @author PSARAVIA
 * @param <T>
 */
public class TLista<T> {

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

    public String imprimir() {
        String aux = "";
        if (!esVacio()) {
            TNodo<T> temp = primero;
            while (temp != null) {
                temp.imprimirEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    public String imprimir(String separador) {
        String aux = "";
        if (!esVacio()) {
            TNodo<T> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
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

    public TNodo<T> eliminar(Comparable codigo) {
        if (!esVacio()) {
            TNodo nodoNulo = null;
            TNodo<T> nodo = primero;
            // Si la lista solo tiene un nodo:
            if (nodo.getSiguiente() == null && nodo.getEtiqueta().equals(codigo)) {
                primero = null;
                return nodo;
            }
            // Si el nodo a sacar es el primer elemento:
            if (nodo.getEtiqueta().equals(codigo)) {
              //  nodoNulo = nodo.getSiguiente();
               // return nodoNulo.getSiguiente();
               nodoNulo = primero;
               primero = nodoNulo.getSiguiente();
               return nodoNulo;
            }
            // Para todos los demás casos
            while (nodo != null) {
                if (nodo.getEtiqueta().equals(codigo)) {
                    nodoNulo.setSiguiente(nodo.getSiguiente());
                    return nodo;
                } else {
                    nodoNulo = nodo;
                    nodo = nodo.getSiguiente();
                }
            }
        }
        return null;
    }

    public int contadorDeElementos() {
        TNodo<T> nodo = primero;
        int contador = 0;

        while (nodo != null) {
            contador++;
            nodo = nodo.getSiguiente();
        }
        return contador;
    }
}
