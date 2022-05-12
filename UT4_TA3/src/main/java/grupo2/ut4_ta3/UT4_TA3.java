/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo2.ut4_ta3;
import grupo2.tda.IElementoAB;
import grupo2.tda.Nodo;
import grupo2.tda.Lista;
import grupo2.tda.TArbolBB;
import grupo2.tda.TElementoBB;

/**
 *
 * @author FIT
 */
public class UT4_TA3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
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
