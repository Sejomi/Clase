package Programacion.Ejercicios6;

import java.util.Arrays;

public class Ej14 {
    public static void main(String[] args) {
        int yea[] = new int[55];

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i ; j++) {
                yea[((i - 1) * i) / 2 + j] = i;
            }
        }
        System.out.println(Arrays.toString(yea));
    }
}
