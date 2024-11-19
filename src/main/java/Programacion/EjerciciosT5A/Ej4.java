package Programacion.EjerciciosT5A;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = entrada.nextInt();

        for (int num1 = 1; num1 <= num; num1++) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
        }
    }
}
