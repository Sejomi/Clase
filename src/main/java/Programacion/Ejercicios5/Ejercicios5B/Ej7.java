package Programacion.Ejercicios5.Ejercicios5B;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        System.out.println("Introduzca 10 números: ");

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n < 0)
                neg++;
            else
                pos++;
        }
        System.out.println("Positivos: " + pos + " " +  "Negativos: " + neg);
    }
}
