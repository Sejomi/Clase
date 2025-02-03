package Programacion.Ejercicios7;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las palabras separadas por espacios: ");
        String[] palabras = sc.nextLine().split(" ");
        System.out.println("Introduce la laongitud de referencia: ");
        int referencia = sc.nextInt();

        System.out.println("Palabras de longitud igual: " + contarPorLongitud(referencia, palabras)[0]);
        System.out.println("Palabras de longitud menor: " + contarPorLongitud(referencia, palabras)[1]);
        System.out.println("Palabras de longitud mayor: " + contarPorLongitud(referencia, palabras)[2]);
    }
    public static int[] contarPorLongitud (int referencia, String[] palabras) {
        int[] longitud = new int[3];
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == referencia)
                longitud[0]++;
            if (palabras[i].length() < referencia)
                longitud[1]++;
            if (palabras[i].length() > referencia)
                longitud[2]++;
        } return longitud;
    }
}
