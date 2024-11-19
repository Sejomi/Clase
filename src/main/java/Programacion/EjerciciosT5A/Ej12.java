package Programacion.EjerciciosT5A;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el exponente: ");
        int num2 = entrada.nextInt();
        int elev = num1;

        for (int i = 1; i < num2; i++) {
            num1 = num1 * elev;
        }
        System.out.println("El resultado es: " + num1);
    }
}
