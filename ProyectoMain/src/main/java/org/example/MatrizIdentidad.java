package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizIdentidad {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        boolean repetir = true;
        boolean verificar = true;
        int dimensiones = 0;

        System.out.println("Bienvenido a la matriz identidad\nDame la dimensión de la matriz");
        do {
            try{
                dimensiones = teclado.nextInt();
            }catch (Exception Err){
                repetir = false;
            }

            if (dimensiones > 1 && dimensiones <= 50){
                repetir = true;
            }else {
                System.out.println("El valor de la dimensión de la matriz debe de ser un número entre 2 y 50, vuelve a introducir la dimensión.");
            }
            teclado.nextLine();
        }while (!repetir);


        int matriz [] [] = new int[dimensiones][dimensiones];
        System.out.println("Rellena la matriz " + dimensiones + "x" + dimensiones);
        // dimensiona maxima de matriz es 50, y minimo 2
        // elementos que forman una matriz, entre -1000 y 1000 ambos incluidos
        // solicitar

        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                matriz [i] [j] = teclado.nextInt();

            }
        }

        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        verificar = false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        verificar = false;
                    }
                }
            }
        }
        if (verificar) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
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
