package Programacion.Ejercicios5.Ejercicios5C;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide: ");
        int height = entrada.nextInt();
        int llinea = height * 2 - 1;

        System.out.println("Introduzca el carácter de relleno: ");
        String cr = entrada.next();
        for (int n = 0; n < height - 1; n++) {
            for (int i = 0; i < llinea; i++) {
                if (i == llinea / 2 - n) {
                    System.out.print(cr);
                } else if (i == llinea / 2 + n) {
                    System.out.print(cr);
                } else if (i == llinea - 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            } if (n == height - 2) {
                for (int i = 0; i < llinea; i++){
                    System.out.print(cr);
               }
            }
        }
    }
}