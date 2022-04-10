package ucu.edu.uy.tda;
import ucu.edu.uy.ut3.ta16.*;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero = null;

    //private Nodo<T> ultimo = null;

    public Lista() {
        primero = null;
        //ultimo = null;
    }
    
    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> aux = primero;
        while (aux != null) {
            if (aux.getEtiqueta().equals(clave.toString())) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }


    public boolean esVacio(){
        return this.primero == null;
    }



    @Override
    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        Nodo<T> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            Nodo<T> temp1 = aux;
            Nodo<T> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                Nodo<T> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    @Override
    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            Nodo<T> temp = primero;
            temp.imprimirEtiqueta();
            }
        return aux;
    }

    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()) {
            return "";
        } else {
            Nodo<T> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }
   
    @Override
    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            INodo aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public Nodo<T> getPrimero() {
        return primero;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }

    //@Override
    //public Nodo<T> getUltimo() {
    //    return ultimo;
   // }

    //@Override
    //public void setUltimo(Nodo<T> unNodo) {
    //    this.ultimo = unNodo;
    //}

    //lista contiene nodo especifico
    public boolean contiene(Pelicula pelicula){
        Nodo<T> aux = primero;
        while (aux != null) {
            if (aux.getEtiqueta().equals(pelicula)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    /*
    @Override
    public void insertar2(Nodo<T> nodo) {
        if (esVacia()) {
            primero = nodo;
        } else {
            Nodo<T> aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
    }
    */
    public void insertar(Nodo<T> nodo) {
        if (esVacio()) {
            primero = nodo;
        } else {
            nodo.setSiguiente(primero);
            primero = nodo;
        }
    }
}
