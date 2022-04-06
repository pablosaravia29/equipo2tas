package com.mycompany.ut3_ta1_ej2;

import java.util.ArrayList;

public interface IAlmacen {

    /**
     * M�todo encargado de agregar un producto al almac�n.
     *
     * @param producto - producto a agregar devuelve el monto en que se ha
     * incrementado el valor del stock o -1 si hay error
     */
    public void agregarProducto(IProducto producto);

    public void procesarArchivo(String ruta);

    public void procesarArchivoVentas(String ruta);

    public void procesarArchivoEliminar(String ruta);

    public void listarProductosEnArchivo();

    public TLista<IProducto> buscarSimilares(String descripcion);

    /**
     * M�todo encargado de buscar un producto cuya clave es la indicada.
     *
     * @param uncodigo - codigo del producto a buscar.
     * @return El producto encontrado. En caso de no encontrarlo, retornar null.
     */
    public IProducto buscarPorCodigo(int uncodigo);

    /**
     * M�todo encargado de buscar un producto cuya clave es la indicada.
     *
     * @param unadescripcion- descripcion del producto a buscar.
     * @return El producto encontrado. En caso de no encontrarlo, retornar
     * null.Str
     */
    public IProducto buscarPorDescripcion(String unadescripcion);

    /**
     * M�todo encargado de eliminar un producto cuyo c�digo es el indicado.
     *
     * @param uncodigo - codigo del producto a eliminar.
     * @return El producto eliminado del almac�n en caso de que la eliminaci�n
     * haya sido efectuada con �xito, o null de lo contrario.
     */
    public IProducto eliminarProducto(int codigo);

    /**
     * M�todo encargado de imprimir en consola los campos de los Productos
     * contenidos en la lista.
     */
    public void imprimir();

    /**
     * Retorna un array de Strings con los datos de los Productos, separadas por
     * el separador pasado por par�metro.
     *
     * @param separador Separa las claves
     * @return
     */
    public ArrayList<String> imprimir(String separador);

    /**
     * Retorna la cantidad de elementos de la lista. En caso de que la lista
     * este vac�a, retornar 0.
     *
     * @return Cantidad de elementos de la lista.
     */
    public int cantElementos();

    /**
     * Indica si la lista contiene o no elementos.
     *
     * @return Si tiene elementos o no.
     */
    public boolean esVacia();

    /**
     * Retorna el primer producto de la lista.
     *
     * @return Primer producto de la lista.
     */
    public IProducto getPrimero();

    public TLista<IProducto> ordenAlfabetico();

}
