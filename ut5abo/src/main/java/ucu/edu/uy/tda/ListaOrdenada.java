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
}
