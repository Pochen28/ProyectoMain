package org.example;

import java.util.Scanner;

public class Cinquecento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int casos = teclado.nextInt();

        for (int i = 0; i < casos; i++) {
            int anio = 0;
            int siglo = 0;
            anio = teclado.nextInt();

            if (anio % 10 != 0) {
                siglo ++;
            }

            String aniostring = Integer.toString(anio);

            String penerrron = (aniostring.substring(0, 2));
            int penerronint = Integer.parseInt(penerrron);
            siglo += penerronint;
            System.out.println(siglo);

        }
    }
}
