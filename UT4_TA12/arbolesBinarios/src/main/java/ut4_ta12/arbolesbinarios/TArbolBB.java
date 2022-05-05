/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut4_ta12.arbolesbinarios;

/**
 *
 * @author Administrador
 */
public class TArbolBB<T> implements IArbolBB<T> {

    private TNodoABB<T> raiz;
    @Override
    public void insertar(TNodoABB nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TNodoABB eliminar(Comparable etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TNodoABB buscar(Comparable etiqueta) {
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
        if (raiz == null){
            return -1;
        }
        else{
            return raiz.tamanio();
        }
    }

    @Override
    public int cantHojas() {
        if (raiz == null){
            return 0;
        }
        else{
            return raiz.altura();
        }
    }

    @Override
    public boolean esVacio() {
        return this.raiz == null;        
    }
    
    
}
