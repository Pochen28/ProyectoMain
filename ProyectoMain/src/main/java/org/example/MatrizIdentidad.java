package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizIdentidad {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int dimensiones = 0;
        String num = "";
        System.out.println("Bienvenido a la matriz identidad\nDame las dimensiones de la matriz");
        dimensiones = teclado.nextInt();
        int matriz [] [] = new int[dimensiones][dimensiones];
        System.out.println("Rellena la matriz " + dimensiones + "x" + dimensiones);
        // dimensiona maxima de matriz es 50, y minimo 2
        // elementos que forman una matriz, entre -1000 y 1000 ambos incluidos
        // solicitar

        for (int i = 0; i < dimensiones; i++) {

            num = teclado.next();
            String numstring = num.replace(" ", "");
            int numint = Integer.parseInt(numstring);
            matriz[i] [contador] = numint;
            contador++;

        }
        for (int columnas []: matriz){
            for (int filas: columnas){
                System.out.print(filas + " ");
            }
            System.out.println();
        }















//        for (int i = 0; i < dimensiones; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i] [j] = 0;
//
//            }
//        }
        for (int columnas []: matriz){
            for (int filas: columnas){
                System.out.print(filas + " ");
            }
            System.out.println();
        }
    }
}
