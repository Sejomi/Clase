package Programacion.Ejercicios10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        int[] array = {2, 5, -10, 50, 32, -1, 0};
        System.out.println(dividirArray(array));
    }
    public static int dividirArray (int[] array) throws ArithmeticException, IndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int[] posiciones = new int[2];

        for (int i = 0; i < posiciones.length; i++) {
            System.out.println("Elija dos posiciones (" + (i+1) + "): ");
            do {
                try {
                    posiciones[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            } while (posiciones[i] != 0);

        } return array[posiciones[0]] / array[posiciones[1]];
    }
}
