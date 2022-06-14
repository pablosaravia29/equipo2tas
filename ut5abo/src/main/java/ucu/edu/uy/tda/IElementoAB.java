package ucu.edu.uy.tda;

public interface IElementoAB<T> {

    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    public IElementoAB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    public IElementoAB<T> getHijoDer();

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @param elemento
     */
    public void setHijoIzq(IElementoAB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @param elemento
     */
    public void setHijoDer(IElementoAB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public IElementoAB<T> buscar(Comparable unaEtiqueta);

 

    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operaci�n.
     */
    public boolean insertar(IElementoAB<T> elemento);

    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @return String conteniendo el PreOrden
     */
    public String preOrden();

    /**
     * Retorna en inorden los elementos del arbol.
     *
     * @param unaLista
     */
    public void inOrden(Lista<T> unaLista);

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @return String conteniendo el PostOrden
     */
    public String postOrden();

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    public T getDatos();
	
	 /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     * @return 
     */
    public IElementoAB eliminar(Comparable unaEtiqueta);
    
    /**
     * Devuelve la altura del árbol. Se toma que la raíz es altura cero (0).
     * Si el árbol es vacío, se retorna -1.
     * @return
     */
    public int altura();
    
    /**
     * Devuelve la cantidad de nodos totales del árbol.
     * @return
     */
    public int tamanio();
    
    /**
     * Dada una etiqueta devuelve el nivel en el que se encuentra el elemento,
     * de lo contrario devuelve -1.
     * @param etiqueta
     * @param nivel
     * @return
     */
    public int nivel(Comparable etiqueta, int nivel);
    
    /**
     *
     * @param frecExito
     * @param frecNoExito
     * @param indiceFE
     * @param indiceFNE
     * @param nivel
     * @return
     */
    public long calcularCosto(int[] frecExito, int[] frecNoExito, int[] indiceFE, int[] indiceFNE, int nivel);

}
