package Programacion.Ejercicios5.Ejercicios5B;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean ncheck = false;
        int neg = 0;
        int pos = 0;
        int nums = 1;

        System.out.println("Introduzca números: ");

        while (nums != 0) {
            nums = sc.nextInt();
            if (nums < 0) {
                ncheck = true;
                neg = neg + 1;
            } else
                pos = pos + 1;
        }
        pos = pos - 1;

        if (ncheck == true) {
            System.out.println("Hay " + pos + " positivos y " + neg + " negativos");
        } else {
            System.out.println("Hay " + pos + " positivos");
        }
    }
}