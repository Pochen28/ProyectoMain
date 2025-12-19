package org.example;

import java.util.Scanner;

/**
 * Programa que permite comprobar si una matriz cuadrada introducida por teclado
 * es una matriz identidad.
 *
 * @author José Luis Riera
 * @version 1.0
 */
public class MatrizIdentidad {

    public static boolean comprobar;

    /**
     * Método principal del programa.
     * <p>
     * Solicita repetidamente la dimensión de una matriz, la rellena con valores
     * introducidos por el usuario y comprueba si se trata de una matriz identidad.
     * El programa finaliza cuando la dimensión introducida es 0.
     * </p>
     *
     * @param args argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
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

    /**
     * Solicita al usuario la dimensión de la matriz.
     * <p>
     * La dimensión debe estar comprendida entre 2 y 50.
     * Si el usuario introduce 0, el método indica que el programa debe finalizar.
     * </p>
     *
     * @author José Luis Riera
     * @version 1.0
     * @param teclado objeto Scanner utilizado para leer la entrada por teclado
     * @return la dimensión válida de la matriz o 0 si se desea salir del programa
     */
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
                    System.out.println("El valor de la dimensión debe estar entre 2 y 50.");
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

    /**
     * Crea y rellena una matriz cuadrada con los valores introducidos por el usuario.
     *
     * @author José Luis Riera
     * @version 1.0
     * @param teclado objeto Scanner utilizado para leer los valores de la matriz
     * @param dimensiones tamaño de la matriz (n x n)
     * @return matriz cuadrada rellena con los valores introducidos
     */
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

    /**
     * Comprueba si una matriz es una matriz identidad.
     * <p>
     * Una matriz identidad tiene el valor 1 en la diagonal principal
     * y 0 en el resto de posiciones.
     * </p>
     *
     * @author José Luis Riera
     * @version 1.0
     * @param matriz matriz cuadrada a comprobar
     * @return true si la matriz es identidad, false en caso contrario
     */
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

    /**
     * Muestra por pantalla el resultado de la comprobación de la matriz.
     *
     * @author José Luis Riera
     * @version 1.0
     * @param verificar resultado de la comprobación de identidad
     */
    public static void resultado(boolean verificar) {
        if (verificar) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
