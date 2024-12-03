package Programacion.Ejercicios6;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int N = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int M = sc.nextInt();
        int[] yea = new int[N];
        for (int i = 0; i < N; i++) {
            yea[i] = M;
        } System.out.println(Arrays.toString(yea));
    }
}
