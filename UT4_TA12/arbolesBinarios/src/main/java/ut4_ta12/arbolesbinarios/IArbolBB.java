/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ut4_ta12.arbolesbinarios;

/**
 *
 * @author Administrador
 */
public interface IArbolBB<T> {
    
    public void insertar(TNodoABB<T> nodo);
    
    public TNodoABB<T> eliminar(Comparable etiqueta);
    
    public TNodoABB<T> buscar(Comparable etiqueta);
    
    public int altura();
    
    public int tamanio();
    
    public int cantHojas();
    
    public boolean esVacio();
}
