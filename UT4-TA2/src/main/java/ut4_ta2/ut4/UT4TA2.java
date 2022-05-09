/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ut4_ta2.ut4;

import ucu.edu.uy.util.ManejadorArchivosGenerico;

/**
 *
 * @author Administrador
 */
public class UT4TA2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        TArbolBB arbolito = new TArbolBB();
        String[] contenido = ManejadorArchivosGenerico.leerArchivo("claves1.txt");
        for (String linea : contenido){
            IElementoAB<Integer> nodi = new TElementoBB (Integer.parseInt(linea), null);
                    
                    
            arbolito.insertar(nodi);
        }
    }
}
