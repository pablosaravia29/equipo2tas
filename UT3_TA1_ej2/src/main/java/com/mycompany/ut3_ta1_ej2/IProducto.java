package ut3.ta2;

public interface IProducto {
	/**
	 * Retorna el codigo del Producto.
	 * 
	 * @return codigo del Producto.
	 */
	public int getCodigo();
	
	/**
	 * Retorna la descripcion del Producto.
	 * 
	 * @return descripción del Producto.
	 */
	public String  getDescripcion();
	
	/**
	 * Retorna el precio unitario del Producto.
	 * 
	 * @return precio del Producto.
	 */
	public int getPrecio();
	
	/**
	 * Retorna el stock  del Producto.
	 * 
	 * @return stock  del Producto.
	 */
	public int getStock();
	public void setStock(int unStock); 
	
	
	public void setSiguiente(IProducto Producto);
	
	/**
	 * Retorna el siguiente Producto al Producto actual.
	 * @return Siguiente Producto del actual
	 */
	public IProducto getSiguiente();

	public void agregarStock(int stock);
	public int restarStock(int stock);
	public void imprimir(); // por consola
	public String imprimir(String separador); //devuelve una string en que los campos están separados por el "separador"
}
