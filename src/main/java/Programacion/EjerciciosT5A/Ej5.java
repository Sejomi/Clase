package Programacion.EjerciciosT5A;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num1 = entrada.nextInt();

        for (int cont1 = num1; cont1 > 1; cont1--) {
            num1 = num1 * (cont1 - 1);
        }
        System.out.println("El factorial es: " + num1);
    }
}
