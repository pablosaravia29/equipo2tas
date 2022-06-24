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

public class Main {

    public static void main(String[] args) {
        TArbolBB arbolPalabras = new TArbolBB();
        ArrayList<String> lista = new ArrayList<>();

        String[] palabras = ManejadorArchivosGenerico.leerArchivo("palabras.txt");
        for (String lineas : palabras) {
            String[] palabra = lineas.split(" ");
            if (palabra.length == 2)
             try {
                lista.add(palabra[0]);
                System.out.println(palabra[0]);
            } catch (Exception e) {
                System.out.println("Error al cargar la linea del archivo");
                continue;
            }
        }
        Collections.shuffle(lista);
        for (String s : lista) {
            arbolPalabras.insertar(new TElementoAB(s, s));

        }

        String[] entrada = ManejadorArchivosGenerico.leerArchivo("entrada.txt");
        for (String linea : entrada) {
            String[] words = linea.split(" ");
            for (String palabra : words) {

                if (palabra.length() != 0) {
                    try {

                        arbolPalabras.cuentaFrec(palabra);

                    } catch (Exception e) {
                        
                    }
                }

            }
        }

        int[] frecExitosas = new int[arbolPalabras.tamanio() + 1];
        int[] frecNoExitosas = new int[arbolPalabras.tamanio() + 1];
        String[] claves = new String[arbolPalabras.tamanio() + 1];

        arbolPalabras.completaVectores(claves, frecExitosas, frecNoExitosas);

        CalculadorMatricesOptimo calculadorOptimo = new CalculadorMatricesOptimo(arbolPalabras.tamanio());
        calculadorOptimo.encontrarOptimo(arbolPalabras.tamanio(), frecExitosas, frecNoExitosas);

        calculadorOptimo.armarArbolBinario(0, arbolPalabras.tamanio(), claves, arbolPalabras);
        System.out.println(arbolPalabras.tamanio());

    }
}
