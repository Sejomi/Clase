package Programacion.Ejercicios6.Ejercicios6A;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int nums[] = new int[20];
        Scanner entrada = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduzca un número: ");
            nums[i] = entrada.nextInt();
                if (nums[i] < 0){
                    neg = neg + nums[i];
                } else if (nums[i] > 0){
                    pos = pos + nums[i];
                }
        }
        System.out.println(pos + " " + neg);
    }
}
