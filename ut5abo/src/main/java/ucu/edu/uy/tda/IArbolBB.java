package ucu.edu.uy.tda;

public interface IArbolBB<T> {

    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operacián
     */

    public boolean insertar(IElementoAB<T> unElemento);

 

    /**
     * Busca un elemento dentro del árbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public IElementoAB<T> buscar(Comparable unaEtiqueta);

    /**
     * Imprime en PreOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String preOrden();

    /**
     * Devuelve una lista de los elementos en InOrden del árbol.
     *
     * @return Lista conteniendo el inorden separado por guiones.
     */
    public Lista<T> inOrden();

    /**
     * Imprime en PostOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el postOrden separado por guiones.
     */
    public String postOrden();

   
    
    
       /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta 
     */
    public void eliminar(Comparable unaEtiqueta);

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
     * @return
     */
    public int nivel(Comparable etiqueta);
    
    /**
     *
     * @return
     */
    public boolean vaciar();
    
    /**
     *
     * @return
     */
    public boolean esVacio();
    
    /**
     *
     * @return
     */
    public IElementoAB<T> getRaiz();
    
    /**
     *
     * @param frecExito
     * @param frecNoExito
     * @return
     */
    public long calcularCosto(int[] frecExito, int[] frecNoExito);
}

