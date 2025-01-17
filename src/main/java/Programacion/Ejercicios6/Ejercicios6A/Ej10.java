package Programacion.Ejercicios6.Ejercicios6A;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float min = 0;
        int omedia = 0;
        float max = 0;
        int umedia = 0;
        float media = 0;
        int N = 0;
        System.out.println("Inrtoduzca un número: ");
        N = sc.nextInt();
        float yea[] = new float[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Introduzca la altura número " + (i + 1) + ": ");
            yea[i] = sc.nextFloat();
            if (i == 0) {
                min = yea[i];
                max = yea[i];
            } else if (yea[i] > max) {
                max = yea[i];
            } else if (yea[i] < min) {
                min = yea[i];
            } media = media + yea[i];
        } media = media / N;
        for (int i = 0; i < N; i++) {
            if (yea[i] >= media) {
                omedia++;
            } else {
                umedia++;
            }
        }
        System.out.println("Media: " + df.format(media) + "\nMin: " + df.format(min) + "\nMax: " + df.format(max) + "\nBajo la media: " + umedia + "\nSobre la media: " + omedia);
    }
}
