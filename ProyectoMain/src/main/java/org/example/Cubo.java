package org.example;

import java.util.Scanner;

public class Cubo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número...");
        int numero = teclado.nextInt();
        int resultado = cubo(numero);
        System.out.println(resultado);
    }
    public static int cubo (int numero){


        return numero*numero*numero;
    }
}
