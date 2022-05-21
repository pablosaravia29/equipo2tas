/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.tda;

/**
 *
 * @author nnavarro
 * @param <T>
 */
public class Conjunto<T> extends Lista<T> implements IConjunto<T>
{

    @Override
    public IConjunto<T> diferenciaSimetrica(IConjunto<T> otroConjunto)
    {
        //Método a implementar

        IConjunto<T> nuevo = new Conjunto<>();
        Nodo<T> aux = this.getPrimero();
        while (aux != null)
        {
            if (otroConjunto.buscar(aux.getEtiqueta()) == null)
            {
                nuevo.insertar(new Nodo(aux.getEtiqueta(), aux.getDato()));
            }
            aux = aux.getSiguiente();
        }

        aux = otroConjunto.getPrimero();
        while (aux != null)
        {
            if (this.buscar(aux.getEtiqueta()) == null)
            {
                nuevo.insertar(new Nodo(aux.getEtiqueta(), aux.getDato()));
            }
            aux = aux.getSiguiente();
        }

        return nuevo;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(Nodo<T> unNodo)
    {
        if (buscar(unNodo.getEtiqueta()) == null)
        {
            super.insertar(unNodo);
        }
    }

}
