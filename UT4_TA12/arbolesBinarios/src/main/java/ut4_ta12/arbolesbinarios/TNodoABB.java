/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut4_ta12.arbolesbinarios;

import static java.lang.Integer.max;

/**
 *
 * @author Administrador
 */
public class TNodoABB<T> implements INodoABB<T> {

    private TNodoABB<T> nodoI;
    private TNodoABB<T> nodoD;
    private Comparable etiqueta;
    private T dato;

    public TNodoABB<T> getNodoI() {
        return nodoI;
    }

    public void setNodoI(TNodoABB<T> nodoI) {
        this.nodoI = nodoI;
    }

    public TNodoABB<T> getNodoD() {
        return nodoD;
    }

    public void setNodoD(TNodoABB<T> nodoD) {
        this.nodoD = nodoD;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public int altura() {
        int contI = 0;
        int contD = 0;
        if (this.nodoI == null && this.nodoD == null) {
            return 0;
        } else {
            if (this.nodoI != null) {
                contI = this.nodoI.altura();
            }
            if (this.nodoD != null) {
                contD = this.nodoD.altura();
            }
        }
        return max(contI, contD) + 1;
    }

    @Override
    public int contHojas() {
        int contI = 0;
        int contD = 0;
        if (this.nodoI == null && this.nodoD == null) {
            return 1;
        } else {
            if (this.nodoI != null) {
                contI = this.nodoI.altura();
            }
            if (this.nodoD != null) {
                contD = this.nodoD.altura();
            }
        }
        return contI + contD;
    }

    @Override
    public int tamanio() {
        int contI = 0;
        int contD = 0;
        if (this.nodoI != null) {
            contI = this.nodoI.altura();
        }
        if (this.nodoD != null) {
            contD = this.nodoD.altura();
        }
        return contI + contD + 1;
    }
}
