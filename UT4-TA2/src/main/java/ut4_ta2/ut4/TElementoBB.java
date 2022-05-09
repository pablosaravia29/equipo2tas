/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut4_ta2.ut4;

import static java.lang.Math.max;

/**
 *
 * @author Administrador
 */
public class TElementoBB<T> implements IElementoAB<T> {

    private IElementoAB<T> izquierdo;
    private IElementoAB<T> derecho;
    private Comparable etiqueta;
    private T dato;

    public TElementoBB(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }

    
    @Override
    public Comparable getEtiqueta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB getHijoIzq() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB getHijoDer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoIzq(IElementoAB elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoDer(IElementoAB elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB buscar(Comparable unaEtiqueta) {
        if (this.getEtiqueta().compareTo(unaEtiqueta) == 0) {
            return this;
        }
        if ((this.getEtiqueta().compareTo(unaEtiqueta) < 0) && (this.getHijoIzq() != null)) {
            return this.getHijoIzq().buscar(unaEtiqueta);
        }
        if ((this.getEtiqueta().compareTo(unaEtiqueta) > 0) && (this.getHijoDer() != null)) {
            return this.getHijoDer().buscar(unaEtiqueta);
        }
        return null;
    }

    @Override
    public boolean insertar(IElementoAB<T> elemento) {
        if (this.getEtiqueta().compareTo(elemento.getEtiqueta()) < 0) {
            if (this.getHijoIzq() != null) {
                return this.getHijoIzq().insertar(elemento);
            } else {
                this.izquierdo = elemento;
                return true;
            }
        }
        if (this.getEtiqueta().compareTo(elemento.getEtiqueta()) > 0) {
            if (this.getHijoDer() != null) {
                return this.getHijoDer().insertar(elemento);
            } else {
                this.derecho = elemento;
                return true;
            }
        }
        return false;
    }

    @Override
    public String preOrden() {
        String resultado = "- " + this.getEtiqueta();
        if (getHijoIzq() != null) {
            resultado = resultado + getHijoIzq().preOrden();
        }
        if (getHijoDer() != null) {
            resultado = resultado + getHijoDer().preOrden();
        }
        return resultado;
    }

    @Override
    public String inOrden() {
        String resultado = "";

        if (getHijoIzq() != null) {
            resultado = resultado + getHijoIzq().inOrden();
        }
        resultado = resultado + "- " + this.getEtiqueta();
        if (getHijoDer() != null) {
            resultado = resultado + getHijoDer().inOrden();
        }
        return resultado;
    }

    @Override
    public String postOrden() {
        String resultado = "";

        if (getHijoIzq() != null) {
            resultado = resultado + getHijoIzq().postOrden();
        }
        if (getHijoDer() != null) {
            resultado = resultado + getHijoDer().postOrden();
        }
        return resultado + "- " + this.getEtiqueta();
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int altura() {
        int contI = 0;
        int contD = 0;
        if (this.izquierdo == null && this.derecho == null) {
            return 0;
        } else {
            if (this.izquierdo != null) {
                contI = this.izquierdo.altura();
            }
            if (this.derecho != null) {
                contD = this.derecho.altura();
            }
        }
        return max(contI, contD) + 1;
    }

    @Override
    public int tamanio() {
        int contI = 0;
        int contD = 0;
        if (this.izquierdo != null) {
            contI = this.izquierdo.altura();
        }
        if (this.derecho != null) {
            contD = this.derecho.altura();
        }
        return contI + contD + 1;
    }

    @Override
    public int contHojas() {
        int contI = 0;
        int contD = 0;
        if (this.izquierdo == null && this.derecho == null) {
            return 1;
        } else {
            if (this.izquierdo != null) {
                contI = this.izquierdo.altura();
            }
            if (this.derecho != null) {
                contD = this.derecho.altura();
            }
        }
        return contI + contD;
    }
}
