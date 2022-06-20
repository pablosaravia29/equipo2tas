package ucu.edu.uy.util;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.IElementoAB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author Ernesto
 */
public class CalculadorMatricesOptimo implements ICalculadorMatricesOptimo
{

    public final int[][] W;
    public final int[][] P;
    public final int[][] R;

    public CalculadorMatricesOptimo(int cantElem)
    {
        W = new int[cantElem + 1][cantElem + 1];
        P = new int[cantElem + 1][cantElem + 1];
        R = new int[cantElem + 1][cantElem + 1];
    }

    @Override
    public void encontrarOptimo(int cantElem, int[] frecExito, int[] frecNoExito)
    {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //int i, j, k, kraiz, h;
        //int min, PesoSubArboles;

        // wii = bii y pii = wii
        
        
        // wij = wii+ aj + bj
        
        
        // h = 1 pij = wij + pii + pjj
        
        
        // h = 2 hasta h = n
        //kraiz = 0;

    }

    /**
     *
     * @param i
     * @param j
     * @param Claves
     * @param elArbolBB
     */
    @Override
    public void armarArbolBinario(int i, int j, String[] Claves, IArbolBB elArbolBB)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void imprimirMatriz(int[][] matriz)
    {
        System.out.println();

        for (int[] matriz1 : matriz)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }

    public void printR()
    {
        imprimirMatriz(R);
    }

    public void printW()
    {
        imprimirMatriz(W);
    }

    public void printP()
    {
        imprimirMatriz(P);
    }
}
