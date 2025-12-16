package org.example;

import java.util.Scanner;

public class MatrizIdentidad {

    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la matriz identidad.");

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
        int dimensiones = 0;
        boolean repetir;

        do {
            repetir = false;
            System.out.println("Dame la dimensión de la matriz.");

            try {
                dimensiones = teclado.nextInt();

                if (dimensiones == 0) {
                    return 0;
                }

                if (dimensiones < 2 || dimensiones > 50) {
                    System.out.println(
                            "El valor de la dimensión debe estar entre 2 y 50.");
                    repetir = true;
                }

            } catch (Exception Err) {
                System.out.println("ERROR, introduce un número.");
                repetir = true;
                teclado.nextLine();
            }

        } while (repetir);

        return dimensiones;
    }


    public static int[][] hacermatriz(Scanner teclado, int dimensiones) {
        int[][] matriz = new int[dimensiones][dimensiones];

        System.out.println("Rellena la matriz " + dimensiones + "x" + dimensiones);

        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                try {
                    matriz[i][j] = teclado.nextInt();
                } catch (Exception Err) {
                    System.out.println("Debes introducir valores numéricos.");
                    teclado.nextLine();
                    j--;
                }
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
