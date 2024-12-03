package Programacion.Ejercicios6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        double[] nums = new double[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número: ");
            nums[i] = entrada.nextDouble();
        }
        System.out.println(Arrays.toString(nums));
    }
}
