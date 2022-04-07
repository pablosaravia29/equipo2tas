/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut3_ta1_ej2;

import static com.mycompany.ut3_ta1_ej2.ManejadorArchivosGenerico.leerArchivo;
import java.util.Arrays;

/**
 *
 * @author PSARAVIA
 */
public class UT3_TA1_ej2 {

    static Almacen geant = new Almacen("Geant");

    public static void main(String[] args) {

        geant.procesarArchivo("src\\main\\java\\com\\mycompany\\ut3_ta1_ej2\\altasPrueba.txt");
        geant.imprimirStock();

        geant.procesarArchivoEliminar("src\\main\\java\\com\\mycompany\\ut3_ta1_ej2\\elimPrueba.txt");
        geant.imprimirStock();
       // geant.procesarArchivoVentas("src\\main\\java\\com\\mycompany\\ut3_ta1_ej2\\ventasPrueba.txt");
       // geant.imprimirStock();

       geant.listarProductosEnArchivo();
       IProducto prod =  geant.buscarPorCodigo(1000073); 
       //System.out.println( prod.imprimirStock());
       
    
        
    }
}
