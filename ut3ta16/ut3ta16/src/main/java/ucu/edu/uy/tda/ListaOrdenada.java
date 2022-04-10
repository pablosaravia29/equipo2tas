package ucu.edu.uy.tda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 * @param <T>
 */
public class ListaOrdenada<T> extends Lista<T>
{   
    

    @Override
    public void insertar(Nodo<T> unNodo)
    {
        if (this.esVacia())
        {
            super.insertar(unNodo);
            return;
        }
        Nodo tempNodo = this.getPrimero();
        if (tempNodo.getSiguiente() == null)
        {
            if (unNodo.compareTo(tempNodo.getEtiqueta()) <= 0)
            {
                unNodo.setSiguiente(tempNodo);
                this.setPrimero(unNodo);
            }
            else
            {
                tempNodo.setSiguiente(unNodo);
            }
            return;
        }
        while (tempNodo.getSiguiente() != null)
        {
            if (unNodo.compareTo(tempNodo.getSiguiente().getEtiqueta()) <= 0)
            {
                unNodo.setSiguiente(tempNodo.getSiguiente());
                tempNodo.setSiguiente(unNodo);
                break;
            }
            tempNodo = tempNodo.getSiguiente();
        }
    }
    /*
    public void insertar(Nodo<T> nodo) {
        if (esVacio()) {
            insertar(nodo);
            return;
        }
        Nodo actual = getPrimero();
        Nodo siguiente = actual.getSiguiente();
        if (actual.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0) {
            actual = nodo;
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
    */
}
