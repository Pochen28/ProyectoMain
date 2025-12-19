package org.example;

import java.util.Scanner;

public class MatrizIdentidadJuez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int dimensiones = verificardimension(teclado);

            if (dimensiones == 0) {
                return;
            }

            int[][] matriz = hacermatriz(teclado, dimensiones);
            boolean verificar = comprobarindentidad(matriz);

            resultado(verificar);
        }
    }

    public static int verificardimension(Scanner teclado) {
        return teclado.nextInt();
    }

    public static int[][] hacermatriz(Scanner teclado, int dimensiones) {
        int[][] matriz = new int[dimensiones][dimensiones];

        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        return matriz;
    }

    public static boolean comprobarindentidad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void resultado(boolean verificar) {
        if (verificar) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
