package ucu.edu.uy.tda;

public class TArbolBB<T> implements IArbolBB<T>
{

    private IElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB()
    {
        raiz = null;
    }

    /**
     * @param unElemento
     * @return
     */
    @Override
    public boolean insertar(IElementoAB<T> unElemento)
    {
        if (esVacio())
        {
            raiz = unElemento;
            return true;
        }
        else
        {
            return raiz.insertar(unElemento);
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta)
    {
//        if (esVacio())
//        {
//            return null;
//        }
//        else
//        {
//            return raiz.buscar(unaEtiqueta);
//        }

        return esVacio() ? null : raiz.buscar(unaEtiqueta);
    }

    /**
     * @return recorrida en inorden del arbol, null en caso de ser vacío
     */
    @Override
    public Lista<T> inOrden()
    {
        Lista<T> unaLista = new Lista<>();
        if (!esVacio())
        {
            raiz.inOrden(unaLista);
        }
        return unaLista;
    }

    /**
     * @return recorrida en preOrden del arbol, null en caso de ser vacío
     */
    @Override
    public String preOrden()
    {
//        if (esVacio())
//        {
//            return null;
//        }
//        else
//        {
//            return raiz.preOrden();
//        }
        return esVacio() ? null : raiz.preOrden();
    }

    /**
     * @return recorrida en postOrden del arbol, null en caso de ser vacío
     */
    @Override
    public String postOrden()
    {
//        if (esVacio())
//        {
//            return null;
//        }
//        else
//        {
//            return raiz.postOrden();
//        }
        return esVacio() ? null : raiz.postOrden();
    }

    @Override
    public void eliminar(Comparable unaEtiqueta)
    {
        if (!esVacio())
        {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }

    /**
     * @return
     */
    @Override
    public boolean esVacio()
    {
        return (raiz == null);
    }

    /**
     * @return True si habían elementos en el árbol, false en caso contrario
     */
    @Override
    public boolean vaciar()
    {
        if (!esVacio())
        {
            raiz = null;
            return true;
        }
        return false;
    }

    @Override
    public int altura()
    {
//        if (esVacio())
//        {
//            return -1;
//        }
//        return raiz.altura();
        return esVacio() ? -1 : raiz.altura();
    }

    @Override
    public int tamanio()
    {
//        if (esVacio())
//        {
//            return -1;
//        }
//        return raiz.tamanio();
        return esVacio() ? -1 : raiz.tamanio();
    }

    @Override
    public int nivel(Comparable etiqueta)
    {
//        if (esVacio())
//        {
//            return -1;
//        }
//        return raiz.nivel(etiqueta, 0);
        return esVacio() ? -1 : raiz.nivel(etiqueta, 0);
    }

    @Override
    public IElementoAB<T> getRaiz()
    {
        return this.raiz;
    }

}
