package ucu.edu.uy.ut5abo;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;
import ucu.edu.uy.util.CalculadorMatricesOptimo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{

    public static void main(String[] args)
    {
        String[] palabras = ManejadorArchivosGenerico.leerArchivo("palabras.txt");
        TArbolBB arbolPalabras = new TArbolBB();
        ArrayList<String> lista = new ArrayList<>();
        for (String lineas : palabras) {
            if(lineas.length() == 2)
                try {
                    String[] palabra = lineas.split(" ");
                    lista.add(palabra[0]);
                } catch (Exception e) {
                    System.out.println("Error al cargar la linea del archivo");
                }
        } 

        Collections.shuffle(lista);
        for(String s: lista) {
            arbolPalabras.insertar(new TElementoAB(s, s));

        }
        Lista<String> temp = new Lista<>();
        temp = arbolPalabras.listaDatosNivelMasProfundo();
        Nodo<String> aux = temp.getPrimero();
        while (aux != null){
            System.out.println(aux.getEtiqueta());
        }
        
        int resultado = 0;
        resultado = arbolPalabras.Iti();
        System.out.println("El resultado de longitud de trayectoria interna es: " + resultado);
    }
}