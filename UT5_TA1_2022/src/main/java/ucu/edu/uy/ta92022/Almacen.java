package ucu.edu.uy.ta92022;

import static java.lang.Integer.parseInt;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;

    private TArbolBB<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<Producto>();
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        IElementoAB<Producto> unElemento = new TElementoAB<>(unProducto.getEtiqueta(), unProducto);
        this.productos.insertar(unElemento);
    }

    public void procesarArchivoAltas(String ruta) {

        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        int montoTotal = 0;

        for (String linea : lineasArchivo) {
            String[] atributosProducto = linea.split(",");
            if (this.buscarPorCodigo(parseInt(atributosProducto[0])) == null) {
                Producto productoAgregado = new Producto(
                        Integer.parseInt(atributosProducto[0]),
                        atributosProducto[1],
                        Integer.parseInt(atributosProducto[2]),
                        Integer.parseInt(atributosProducto[3]));
                this.insertarProducto(productoAgregado);
            } else {
                this.agregarStock(Integer.parseInt(atributosProducto[0]), Integer.parseInt(atributosProducto[3]));

            }
            montoTotal += Integer.parseInt(atributosProducto[2]) * Integer.parseInt(atributosProducto[3]);
        }
        System.out.println("El monto se ha incrementedo en : $" + montoTotal);
    }

    public void procesarArchivoVentas(String ruta) {
        int montoTotal = 0;
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        for (String linea : lineasArchivo) {
            String[] atributosVenta = linea.split(",");
            if (this.buscarPorCodigo(parseInt(atributosVenta[0])) != null) {
                montoTotal += this.restarStock(Integer.parseInt(atributosVenta[0]), Integer.parseInt(atributosVenta[1]));
            }
        }
        System.out.println("El monto se ha reducido en : $" + montoTotal);
    }

    public void procesarArchivoEliminar(String ruta) {

        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineasArchivo = manejador.leerArchivo(ruta);
        int valorReducido = 0;

        for (String linea : lineasArchivo) {
            IProducto productoAux = this.buscarPorCodigo(parseInt(linea));

            if (productoAux != null) {
                valorReducido += productoAux.getPrecio() * productoAux.getStock();
            }

            this.eliminarProducto(parseInt(linea));
        }
        System.out.println("El valor reducido del stock es: $" + valorReducido);
    }

    @Override
    public String imprimirProductos() {

        Lista<Producto> unaLista = new Lista<>();
        productos.getRaiz().inOrden(unaLista);

        INodo<Producto> aux = unaLista.getPrimero();
        while (aux != null) {
            System.out.println(aux.getDato().toString());
            aux = aux.getSiguiente();
        }
        return " ";
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        IElementoAB<Producto> buscado = productos.buscar(clave);
        if (buscado != null) {
            Integer stock = buscado.getDatos().getStock();

            buscado.getDatos().setStock(stock + cantidad);
            return true;
        }

        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {

        IElementoAB<Producto> producto = productos.buscar(clave);
        if (producto != null) {

            if (producto.getDatos().getStock() - cantidad >= 0) {
                producto.getDatos().setStock(producto.getDatos().getStock() - cantidad);
                return producto.getDatos().getPrecio() * cantidad;
            } else {
                int stock = producto.getDatos().getStock() * producto.getDatos().getPrecio();
                producto.getDatos().setStock(0);
                return stock;
            }
        }
        return 0;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {

        IElementoAB<Producto> buscado = productos.buscar(clave);
        return buscado == null ? null : buscado.getDatos();

    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        productos.eliminar(clave);
        return false;
    }
    
    public void listarOrdenados (){
                ListaOrdenada<Producto> listaOrdenada = new ListaOrdenada<>();
        Lista <Producto> temporal = productos.inOrden();
        Nodo <Producto> aux = temporal.getPrimero();
        while (aux != null){
            Nodo<Producto> aInsertar = new Nodo(aux.getDato().getNombre(), aux.getDato());
            listaOrdenada.insertar(aInsertar);
            aux = aux.getSiguiente();
        }
        String[] lineas = new String[listaOrdenada.cantElementos()];
        Nodo<Producto> temp = listaOrdenada.getPrimero();
        int i = 0;
        int valorM =0;
        while (temp != null) {
            valorM += temp.getDato().getPrecio() * temp.getDato().getStock();
            lineas [i] = temp.getDato().getNombre() + "," + temp.getDato().getPrecio();
            i++;
            temp = temp.getSiguiente();
        }
        ManejadorArchivosGenerico.escribirArchivo("prdocutos.txt", lineas);
        System.out.println("El valor monetario total es : $" + valorM);

    }
    
}
