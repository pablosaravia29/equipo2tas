/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

import static com.mycompany.ut3_ta1_ej2.ManejadorArchivosGenerico.leerArchivo;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

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
        if (listaProductos.buscar(etiqueta) != null) {
            Producto aux = (Producto) (listaProductos.buscar(etiqueta)).getDato();

            int stockActual = aux.getStock();
            aux.setStock(stockActual + cantidad);
        }
    }

    public int reducirStock(Comparable etiqueta, int cantidad) {
        //TNodo<Producto> aux = listaProductos.buscar(etiqueta);
        Producto aux = (Producto) (listaProductos.buscar(etiqueta)).getDato();
        if (aux != null) {
            int stockActual = aux.getStock();
            if (stockActual - cantidad < 0) {
                aux.setStock(0);
                return stockActual * aux.getPrecio();
            } else {
                aux.setStock(stockActual - cantidad);
                return cantidad * aux.getPrecio();
            }
        }
        return 0;
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
        if (listaProductos.esVacio()) {
            return null;

        } else {
            TNodo<Producto> nodo = listaProductos.getPrimero();
            while (nodo != null) {
                if (nodo.getEtiqueta().equals(codigo)) {
                    IProducto producto = (IProducto) nodo.getDato();
                    return producto;
                }
                nodo = nodo.getSiguiente();
            }
            return null;
        }

        /*   TNodo<IProducto> productoBuscado = listaProductos.buscar(codigo);
        if (productoBuscado != null) {
            return productoBuscado.getDato();
        } else {
            return null;
        }*/
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
    public IProducto eliminarProducto(int codigo) {        
        TNodo<IProducto> productoEliminado = listaProductos.eliminar(codigo);
        
        if (productoEliminado == null) {
            return null;
        }
        
        return (IProducto) productoEliminado.getDato();
    }
    
    public int valorStock(){
        int valor = 0;
        TNodo <Producto> nodo = this.listaProductos.getPrimero();
        while (nodo != null){
            Producto producto = nodo.getDato();
            valor += producto.getPrecio()*producto.getStock();
            nodo = nodo.getSiguiente();
        }
        return valor;
    }

    @Override
    public void imprimir() {
        this.listaProductos.imprimir();

    }

    @Override
    public ArrayList<String> imprimir(String separador) {
        return null;
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
    public void procesarArchivo(String ruta) {

        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        int montoTotal = 0;

        for (String linea : lineasArchivo) {
            String[] atributosProducto = linea.split(",");
            if (this.buscarPorCodigo(parseInt(atributosProducto[0])) == null) {
                IProducto productoAgregado = new Producto(
                        Integer.parseInt(atributosProducto[0]),
                        atributosProducto[1],
                        Integer.parseInt(atributosProducto[2]),
                        Integer.parseInt(atributosProducto[3]));
                this.agregarProducto(productoAgregado);
            } else {
                this.aumentarStock(atributosProducto[0], Integer.parseInt(atributosProducto[3]));

            }
            montoTotal += Integer.parseInt(atributosProducto[2]) * Integer.parseInt(atributosProducto[3]);
        }
        System.out.println("El monto se ha incrementedo en : $" + montoTotal);
    }

    @Override
    public void procesarArchivoVentas(String ruta) {
        int montoTotal = 0;
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        for (String linea : lineasArchivo) {
            String[] atributosVenta = linea.split(",");
            if (this.buscarPorCodigo(parseInt(atributosVenta[0])) != null) {
                montoTotal += this.reducirStock(atributosVenta[0], Integer.parseInt(atributosVenta[1]));
            }
        }
        System.out.println("El monto se ha reducido en : $" + montoTotal);
    }

    @Override
    public void procesarArchivoEliminar(String ruta) {
        
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        int valorReducido = 0;
        
        for (String linea : lineasArchivo) {
            IProducto productoAux = this.buscarPorCodigo(parseInt(linea));
            
            if(productoAux != null){
                valorReducido += productoAux.getPrecio()*productoAux.getStock();
            }
            
            this.eliminarProducto(parseInt(linea));
        }
        System.out.println("El valor reducido del stock es: " + valorReducido);
    }

    @Override
    public void listarProductosEnArchivo() {
        ArrayList<String> aux = new ArrayList<String>();
        //recorremos la lista sin ordenarla ya que nosotros siempre insertamos ordenado
        TLista listaOrdenada = this.ordenAlfabetico();
        TNodo<IProducto> nodo = listaOrdenada.getPrimero();
        String[] resultado;
        while (nodo != null) {
            IProducto unProducto = (IProducto) nodo.getDato();
            aux.add(unProducto.getNombre() + "," + unProducto.getPrecio());
            nodo = nodo.getSiguiente();
        }
        resultado = aux.toArray(new String[0]);
        ManejadorArchivosGenerico.escribirArchivo("src\\main\\java\\com\\mycompany\\ut3_ta1_ej2\\productos.txt", resultado);
    }

    @Override
    public boolean esVacia() {
        return listaProductos.esVacio();
    }

    @Override
    public TLista<IProducto> buscarSimilares(String descripcion) {
        TLista<IProducto> aux = new TLista<>();
        TNodo<Producto> nodo = this.listaProductos.getPrimero();
        while (nodo != null) {
            IProducto unProducto = (IProducto) nodo.getDato();
            if (unProducto.getNombre().contains(descripcion)) {
                TNodo<IProducto> nodoAux = new TNodo<>(unProducto.getCodigo(), unProducto);
                aux.insertar(nodoAux);
            }
            nodo = nodo.getSiguiente();
        }
        return aux;
    }

    @Override
    public TLista<IProducto> ordenAlfabetico() {
        TLista<IProducto> listaAux = new TLista<IProducto>();
        TNodo<IProducto> primeroAux = this.getListaProductos().getPrimero();
        while (primeroAux != null) {
            TNodo<IProducto> clonacion = new TNodo<IProducto>(primeroAux.getDato().getNombre(), primeroAux.getDato());
            listaAux.insertarOrdenado(clonacion);
            primeroAux = primeroAux.getSiguiente();
        }
        return listaAux;
    }
}
