package Programacion.Ejercicios6;

import java.util.Arrays;

public class Ej11 {
    public static void main(String[] args) {
        int yeap[] = new int[100];
        int yean[] = new int[100];
        for (int i = 0; i < 100; i++) {
            yeap[i] = i + 1;
            yean[i] = 100 - i;
        }
        System.out.println(Arrays.toString(yeap) + "\n" + Arrays.toString(yean));
    }
}
