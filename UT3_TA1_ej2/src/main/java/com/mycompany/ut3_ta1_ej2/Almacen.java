/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

import static com.mycompany.ut3_ta1_ej2.ManejadorArchivosGenerico.leerArchivo;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author PSARAVIA
 */
public class Almacen implements IAlmacen {

    private final TLista listaProductos;
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

    public void agregarProducto(IProducto producto) {
        TNodo aux = new TNodo(producto.getCodigo(), producto);
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
        if (aux != null) {
            int stockActual = aux.getStock();
            if (stockActual - cantidad < 0) {
                aux.setStock(0);
            } else {
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

    @Override
    public IProducto buscarPorCodigo(int codigo) {
        //if(!listaProductos.esVacio()){
        TNodo<IProducto> productoBuscado = listaProductos.buscar(codigo);
        if (productoBuscado != null) {
            return productoBuscado.getDato();
        } else {
            return null;
        }
    }

    @Override
    public IProducto buscarPorDescripcion(String unaDescripcion) {
        String descripcion = unaDescripcion.toLowerCase();
        if (!listaProductos.esVacio()) {
            TNodo<IProducto> productoBuscado = listaProductos.getPrimero();
            while (productoBuscado != null) {
                if (productoBuscado.getDato().getNombre().toLowerCase().equals(descripcion)) {
                    return productoBuscado.getDato();
                }
                productoBuscado = productoBuscado.getSiguiente();
            }
        }
        return null;
    }

    @Override
    public IProducto eliminarProducto(Comparable codigo) {
        TNodo<IProducto> productoEliminado = listaProductos.eliminar(codigo);
        if (productoEliminado == null) {
            return null;
        }
        return (IProducto) productoEliminado.getDato();
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> imprimir(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        return listaProductos.contadorDeElementos();
    }

    @Override
    public IProducto getPrimero() {
        return (IProducto) listaProductos.getPrimero();
    }

    @Override
    public void procesarArchivo(Almacen almacen, String ruta) {

        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        int montoTotal = 0;

        for (String linea : lineasArchivo) {
            String[] atributosProducto = linea.split(",");
            if (almacen.buscarPorCodigo(parseInt(atributosProducto[0])) == null) {
                IProducto productoAgregado = new Producto(
                        Integer.parseInt(atributosProducto[0]),
                        atributosProducto[1],
                        Integer.parseInt(atributosProducto[2]),
                        Integer.parseInt(atributosProducto[3]));
                almacen.agregarProducto(productoAgregado);
            }
            else{
                almacen.aumentarStock(atributosProducto[0], Integer.parseInt(atributosProducto[3]));
                
            }
            montoTotal += Integer.parseInt(atributosProducto[2]) * Integer.parseInt(atributosProducto[3]);
        }
        System.out.println("El monto se ha incrementedo en : $" + montoTotal);
    }

    @Override
    public boolean esVacia() {
        return listaProductos.esVacio();
    }
}
