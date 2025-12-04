package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    static void main() {
        Scanner teclado = new Scanner(System.in);




    }

    public static double[] introducirRecaudacion () {
        Scanner teclado = new Scanner(System.in);
        double valores [] = new double[6];
        System.out.println("Intoduce los ingresos semanales:");
        for (int i = 0; i < 6; i++) {
            switch (i){
                case 0:
                    System.out.print("Martes: ");
                    valores [i] = teclado.nextDouble();
                    break;
                case 1:
                    System.out.print("Miércoles: ");
                    valores [i] = teclado.nextDouble();
                    break;
                case 2:
                    System.out.print("Jueves: ");
                    valores [i] = teclado.nextDouble();
                    break;
                case 3:
                    System.out.print("Viernes: ");
                    valores [i] = teclado.nextDouble();
                    break;
                case 4:
                    System.out.print("Sábado: ");
                    valores [i] = teclado.nextDouble();
                    break;
                case 5:
                    System.out.print("Domingo: ");
                    valores [i] = teclado.nextDouble();
                    break;
            }
        }
        System.out.println(Arrays.toString(valores));
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length -i; j++) {

            }

        }
        return valores;
    }
}
