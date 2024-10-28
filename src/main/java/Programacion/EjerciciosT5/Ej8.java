package Programacion.EjerciciosT5;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        System.out.println("Introduzca un número: ");
        num1 = leer.nextDouble();

        System.out.println("Introduzca otro número: ");
        num2 = leer.nextDouble();

        if (num1 == num2) {
            System.exit(0);
        } else {
            if (num1 % 1 == 0) {
                if (num2 % 1 == 0) {
                    System.out.println((int)num1 + ", " + (int)num2);
                } else {
                    System.out.println((int)num1);
                }
            }else {
                if (num2 % 1 == 0) {
                    System.out.println((int)num2);
                } else {
                    System.out.println("Ninguno es entero");
                }
            }
        }
    }
}
