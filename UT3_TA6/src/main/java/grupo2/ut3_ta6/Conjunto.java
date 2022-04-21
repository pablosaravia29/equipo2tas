package grupo2.ut3_ta6;

public class Conjunto<T> extends Lista<T> {


    public Nodo insertarElementoDeConjuto(Nodo nodoX) {
        return this.buscar(nodoX.getEtiqueta());
    }
    
    public Conjunto union(Conjunto conjuntoX) {
        if (this.esVacia()) {
            return conjuntoX;
        } else if (conjuntoX.esVacia()) {
            return this;
        }

        Conjunto<T> conjuntoResultado = new Conjunto();
        Nodo<T> nodoA = this.getPrimero();
        Nodo<T> nodoB = conjuntoX.getPrimero();

        while (nodoA != null) {
            conjuntoResultado.insertar(nodoA.clonar());
            nodoA = nodoA.getSiguiente();
        }
        while (nodoB != null) {
            if (conjuntoResultado.insertarElementoDeConjuto(nodoB) == null) {
                conjuntoResultado.insertar(nodoB);
            }
            nodoB = nodoB.getSiguiente();
        }
        return conjuntoResultado;
    }

    public Conjunto interseccion(Conjunto conjuntoX) {
        if (this.esVacia() || conjuntoX.esVacia()) {
            return new Conjunto();
        }

        Conjunto<T> conjuntoResultado = new Conjunto();
        Nodo<T> nodoA = this.getPrimero();

        while (nodoA != null) {         
            if (conjuntoX.insertarElementoDeConjuto(nodoA) != null) {
                conjuntoResultado.insertar(nodoA.clonar());
            }
            nodoA = nodoA.getSiguiente();
        }
            return conjuntoResultado;
    }
}

