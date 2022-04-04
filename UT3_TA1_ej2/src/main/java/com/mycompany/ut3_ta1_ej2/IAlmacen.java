package ut3.ta2;

import java.util.ArrayList;



public interface IAlmacen {
	/**
	 * Método encargado de agregar un producto al almacén.
	 * 	
	 * @param producto - producto a agregar 
	 * devuelve el monto en que se ha incrementado el valor del stock o -1 si hay error
	 */
	public int agregar(IProducto unproducto);
	
	/**
	 * Método encargado de buscar un producto cuya clave es la indicada.
	 * 
	 * @param uncodigo - codigo del producto a buscar.
	 * @return El producto encontrado. En caso de no encontrarlo, retornar null.
	 */
	public IProducto buscarPorCodigo(int uncodigo);
	
	/**
	 * Método encargado de buscar un producto cuya clave es la indicada.
	 * 
	 * @param unadescripcion- descripcion del producto a buscar.
	 * @return El producto encontrado. En caso de no encontrarlo, retornar null.Str
	 */
	public IProducto buscarPorDescripcion(String unadescripcion);
	
	/**
	 * Método encargado de eliminar un producto cuyo código es el indicado.
	 * 
	 * @param uncodigo - codigo del producto a eliminar.
	 * @return El producto eliminado del almacén en caso de que la eliminación haya sido efectuada con éxito, o null de lo contrario.
	 */
	public IProducto eliminar(int unCodigo);
	
	/**
	 * Método encargado de imprimir en consola los campos de los Productos 
	 * contenidos en la lista.
	 */
	public void imprimir(); 
	
	/**
	 * Retorna un array de Strings con los datos de los Productos, separadas por el separador pasado por parámetro.
	 * @param separador Separa las claves 
	 * @return
	 */
	public ArrayList<String> imprimir(String separador);
	/**
	 * Retorna la cantidad de elementos de la lista. En caso de 
	 * que la lista este vacía, retornar 0.
	 * @return Cantidad de elementos de la lista.
	 */
	public int cantElementos();
	
	/**
	 * Indica si la lista contiene o no elementos.
	 * @return Si tiene elementos o no.
	 */
	public boolean esVacia();
	
	/**
	 * Retorna el primer producto de la lista.
	 * @return Primer producto de la lista.
	 */
	public IProducto getPrimero();
	
}
