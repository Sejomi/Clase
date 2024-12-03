package Programacion.Ejercicios6;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int nums[] = new int[20];
        Scanner entrada = new Scanner(System.in);
        int media = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduzca un número: ");
            nums[i] = entrada.nextInt();
            media += nums[i];
        } media = media / nums.length;
        System.out.println(media);
    }
}
