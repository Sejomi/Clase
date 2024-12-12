package Programacion.Ejercicios6;

import Programacion.numerosEnteros;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean corr = true;
        String yea1[] = new String[10];
        String yea2[] = new String[10];
        int yea3[] = new int[10];
        int yea4[] = new int[10];

        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Introduzca el valor " + (i + 1) + ": ");
                yea1[i] = sc.next();
            } while (!numerosEnteros.comprobar(yea1[i]));
            yea3[i] = Integer.parseInt(yea1[i]);
        } for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Introduzca el valor " + (i + 11) + ": ");
                yea2[i] = sc.next();
            } while (!numerosEnteros.comprobar(yea2[i]));
            yea4[i] = Integer.parseInt(yea2[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (yea3[i] != yea4[i]) {
                corr = false;
                break;
            }
        }

        if (corr) {
            System.out.println("Los 10 primeros números son iguales a los 10 siguientes");
        } else {
            System.out.println("Los 10 primeros números no son iguales a los 10 siguientes");
        }
    }
}
