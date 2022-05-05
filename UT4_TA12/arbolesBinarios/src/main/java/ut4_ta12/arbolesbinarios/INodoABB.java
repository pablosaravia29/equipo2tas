/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ut4_ta12.arbolesbinarios;

/**
 *
 * @author Administrador
 */
public interface INodoABB<T>{
    
    public TNodoABB<T> getNodoI();
    public void setNodoI(TNodoABB<T> nodoI);
    public TNodoABB<T> getNodoD();
    public void setNodoD(TNodoABB<T> nodoD);
    public Comparable getEtiqueta();
    public void setEtiqueta(Comparable etiqueta);
    public T getDato();
    public void setDato(T dato);
    
    public int altura();
    public int tamanio();
    public int contHojas();
    
}
