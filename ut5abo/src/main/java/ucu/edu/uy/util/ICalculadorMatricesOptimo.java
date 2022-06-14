package ucu.edu.uy.util;

import ucu.edu.uy.tda.IArbolBB;

public interface ICalculadorMatricesOptimo
{

    /**
     *
     * @param i
     * @param j
     * @param claves
     * @param elArbolBB
     */
    void armarArbolBinario(int i, int j, String[] claves, IArbolBB elArbolBB);

    /**
     *
     * @param cantElem
     * @param frecExito
     * @param frecNoExito
     */
    public void encontrarOptimo(int cantElem, int[] frecExito, int[] frecNoExito);

}
