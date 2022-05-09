/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut4_ta2.ut4;

/**
 *
 * @author Administrador
 */
public class TArbolBB<T> implements IArbolBB<T>{
    
    private IElementoAB<T> raiz;
    @Override
    public boolean insertar(IElementoAB unElemento) {
       if (raiz == null){
           raiz = unElemento; 
           return true;
        }
        else{
            return raiz.insertar(unElemento);
        } 
    }

    @Override
    public IElementoAB buscar(Comparable unaEtiqueta) {
        if (raiz == null){
            return null;
        }
        else{
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
        if (raiz == null){
            return "";
        }
        else{
            return raiz.preOrden();
        }
    }

    @Override
    public String inOrden() {
        if (raiz == null){
            return "";
        }
        else{
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if (raiz == null){
            return "";
        }
        else{
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int altura() {
        if (raiz == null){
            return -1;
        }
        else{
            return raiz.altura();
        }
    }

    @Override
    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantHojas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
