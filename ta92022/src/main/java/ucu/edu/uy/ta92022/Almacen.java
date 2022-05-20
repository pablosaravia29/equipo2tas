package ucu.edu.uy.ta92022;

import static java.lang.Integer.parseInt;
import ucu.edu.uy.tda.IElementoAB;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;
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

    @Override
    public String imprimirProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {

        IElementoAB<Producto> buscado = productos.buscar(clave);
        return buscado == null ? null : buscado.getDatos();

    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
