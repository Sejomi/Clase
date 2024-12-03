package Programacion.Ejercicios6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        double[] nums = new double[10];
        Scanner entrada = new Scanner(System.in);
        double max = 0;
        double min = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número: ");
            nums[i] = entrada.nextDouble();
        } for (int i = 0; i < 10; i++) {
            if (i == 0){
                max = nums[i];
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(max + " " + min);

    }
}
