package Programacion.Ejercicios6.Ejercicios6A;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        int yea[] = new int[100];
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca un número entre 1 y 10: ");
            num1 = sc.nextInt();
        } while (num1 < 1 || num1 > 10);
        System.out.print("Su número aparece en ");
        for (int i = 0; i < yea.length; i++) {
            yea[i] = (int) (Math.random() * 10) + 1;
            if (yea[i] == num1) {
                System.out.print(i + " ");
            }
        }
    }
}
