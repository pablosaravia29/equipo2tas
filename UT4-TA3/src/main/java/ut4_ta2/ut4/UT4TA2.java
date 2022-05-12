/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ut4_ta2.ut4;

import ucu.edu.uy.util.ManejadorArchivosGenerico;
import ut4_ta2.ut4.*;
/**
 *
 * @author Administrador
 */
public class UT4TA2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        TArbolBB arbolito = new TArbolBB();
        /*String[] contenido = ManejadorArchivosGenerico.leerArchivo("claves1.txt");
        for (String linea : contenido){
            IElementoAB<Integer> nodi = new TElementoBB (Integer.parseInt(linea), null);
                    
                    
            arbolito.insertar(nodi);
        }*/
        IElementoAB <Integer> unElemento = new TElementoBB <Integer> ("1",1);
        IElementoAB <Integer> unElemento1 = new TElementoBB <Integer> ("2",2);
        IElementoAB <Integer> unElemento2 = new TElementoBB <Integer> ("3",3);
        arbolito.insertar(unElemento);
        arbolito.insertar(unElemento1);
        arbolito.insertar(unElemento2);
        Lista<Integer> resultado = arbolito.inorden();
        Nodo temp = resultado.getPrimero();
        while (temp != null){
            System.out.println(temp.getEtiqueta());
            temp = temp.getSiguiente();
        }
    }
}
