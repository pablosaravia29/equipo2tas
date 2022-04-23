/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo2.ut3_ta6;

/**
 *
 * @author Administrador
 */
public class Pila<T> implements IPila<T> {

    private Nodo<T> primerDatoPila;

    public Pila() {
        primerDatoPila = null;
    }

    //push
    @Override
    public void apilar(Nodo<T> dato) {
        if (esVacia()) {
            primerDatoPila = dato;
        } else {
            dato.setSiguiente(primerDatoPila);
            primerDatoPila = dato;
        }
    }

    //pop
    @Override
    public Nodo<T> desapilar() {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> dato = primerDatoPila.clonar();
            this.primerDatoPila = primerDatoPila.getSiguiente();
            return dato;
        }
    }

    @Override
    public Nodo<T> tope() {
        return primerDatoPila;
    }

    @Override
    public boolean esVacia() {
        return primerDatoPila == null;
    }

    @Override
    public void vaciar() {
        primerDatoPila = null;

    }

    @Override
    public boolean estaLlena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
