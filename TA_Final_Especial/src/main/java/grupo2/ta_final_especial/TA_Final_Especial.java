/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo2.ta_final_especial;

import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author Administrador
 */
public class TA_Final_Especial {

    public static void main(String[] args) {
       TArbolBB arbolResultado = new TArbolBB();
        TElementoAB elem1 = new TElementoAB("hola", "1");
        TElementoAB elem2 = new TElementoAB("chau", "2");
        TElementoAB elem3 = new TElementoAB("zzzz", "3");
        /*TElementoAB elem4 = new TElementoAB("4", "4");
        TElementoAB elem5 = new TElementoAB("5", "5", 31);*/

        arbolResultado.insertar(elem1);
        arbolResultado.insertar(elem2);      
        arbolResultado.insertar(elem3);
        
        Lista<Integer> lista1 = new Lista<Integer> ();
        Lista<Integer> lista2 = new Lista<Integer> ();
        Lista<Integer> lista3 = new Lista<Integer> ();
        
        Nodo nodo1 = new Nodo (1,1);
        Nodo nodo2 = new Nodo (2,2);
        Nodo nodo4 = new Nodo (4,4);
        Nodo nodo6 = new Nodo (6,6);
        Nodo nodo8 = new Nodo (8,8);
        Nodo nodo10 = new Nodo (10,10);
        
        lista1.insertar(nodo1);
        lista1.insertar(nodo2);
        lista1.insertar(nodo4);
        
        lista2.insertar(nodo8);
        lista2.insertar(nodo10);
        
        lista3.insertar(nodo8);
        lista3.insertar(nodo6);
        lista3.insertar(nodo2);
        
        elem1.setListaEnteros(lista1);
        elem2.setListaEnteros(lista2);
        elem3.setListaEnteros(lista3);
        
        Lista<Integer> listaresult = arbolResultado.paresPalabra("chau");
        /*int resultadoObtenido = listaresult.cantElementos();
        int resultadoEsperado = 4;                       
        assertEquals(resultadoEsperado, resultadoObtenido);*/
    }
}
