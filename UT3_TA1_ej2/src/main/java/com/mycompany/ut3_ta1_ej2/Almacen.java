/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;
/**
 *
 * @author PSARAVIA
 */
public class Almacen {
    

    private TLista listaProductos;
    private String nombre;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new TLista();
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public TLista getListaProductos() {
        return this.listaProductos;
    }

    public void agregarProducto(Producto producto) {
        TNodo aux = new TNodo(producto.getEtiqueta(), producto);
        this.listaProductos.insertarOrdenado(aux);
    }

    public void aumentarStock(Comparable etiqueta, int cantidad) {
        Producto aux = (Producto) (listaProductos.buscar(etiqueta)).getDato();
        if (aux != null) {
            int stockActual = aux.getStock();
            aux.setStock(stockActual + cantidad);
        }
    }

    public void reducirStock(Comparable etiqueta, int cantidad) {
        //TNodo<Producto> aux = listaProductos.buscar(etiqueta);
	Producto aux = (Producto) (listaProductos.buscar(etiqueta)).getDato();  
        if(aux != null) {
            int stockActual = aux.getStock();
            if(stockActual - cantidad < 0) {
                aux.setStock(0);
            }
            else {
                aux.setStock(stockActual - cantidad);
            }
        }
    }

    public void imprimirStock() {
        TLista aux = this.getListaProductos();
        TNodo nodo = aux.getPrimero();
        if (!aux.esVacio()) {
            while (nodo != null) {
                System.out.println(nodo.getDato().toString());
                nodo = nodo.getSiguiente();
            }
        }
    }


    
}
