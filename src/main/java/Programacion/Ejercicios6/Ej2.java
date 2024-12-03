package Programacion.Ejercicios6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double[] nums = new double[10];
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número: ");
            nums[i] = entrada.nextDouble();
        } for (int i = 0; i < 10; i++) {
            total = total + nums[i];
        }
        System.out.println(total);

    }
}
