package Programacion.EjerciciosT5B;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = 0;
        System.out.print("Introduzca un numero: ");
        num1 = sc.nextInt();
        if (num1 < 1) {
            for (int i = 0; i < -num1; i++) {
                System.out.print("#");
            }
        } else {
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
        }
    }
}
