package Programacion.Ejercicios6.Ejercicios6A;

import java.util.Arrays;

public class Ej14 {
    public static void main(String[] args) {
        int yea[] = new int[55];
        int n = 0;

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                yea[n] = i;
                n++;
            }
        } System.out.println(Arrays.toString(yea));
    }
}
