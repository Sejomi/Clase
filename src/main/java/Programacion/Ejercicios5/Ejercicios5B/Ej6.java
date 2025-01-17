package Programacion.Ejercicios5.Ejercicios5B;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        boolean neg = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 5 números: ");

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num < 0) {
                neg = true;
            }
        } if (neg == true) {
            System.out.println("Hay negativos");
        } else {
            System.out.println("No hay negativos");
        }






    }
}
