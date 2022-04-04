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

    public static void main(String[] args) {
        System.out.println("Test");
     
      System.out.println(Arrays.toString(leerArchivo("C:\\Users\\FIT\\Documents\\NetBeansProjects\\equipo2tas\\UT3_TA1_ej2\\src\\main\\java\\com\\mycompany\\ut3_ta1_ej2\\altasPrueba.txt")));
    }
}
