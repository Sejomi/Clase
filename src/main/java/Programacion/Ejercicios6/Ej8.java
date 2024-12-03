package Programacion.Ejercicios6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        double yea[] = new double[100];
        double num1 = 0;
        int val1 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca un número entre 0 y 1: ");
            num1 = sc.nextDouble();
        } while (num1 < 0 || num1 > 1);
        for (int i = 0; i < yea.length; i++) {
            yea[i] = Math.random();
            if (yea[i] >= num1) {
                val1++;
            }
        }
        System.out.println(val1 + " números son superiores al introoducido.");
    }
}
