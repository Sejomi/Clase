package Programacion.Ejercicios6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int P = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int Q = sc.nextInt();
        if (P < Q) {
            int[] yea = new int[(Q - P) - 1];
            for (int i = 0; i < (Q - P) - 1; i++) {
                yea[i] = (P + 1) + i;
            } System.out.println(Arrays.toString(yea));
        } else if (Q < P) {
            int[] yea = new int[(P - Q) - 1];
            for (int i = 0; i < (P - Q) - 1; i++) {
                yea[i] = (Q + 1) + i;
            } System.out.println(Arrays.toString(yea));
        } else {
            System.out.println("INFINITOS");
        }
    }
}
