package Programacion.EjerciciosT5Extra;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hora = -1;

        //Sin acabar
        System.out.println("Introduzca la hora: ");
        while (hora > 24 || hora < 0) {
            try {
                hora = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Introduzca un valor válido: ");
            }
        } switch (hora) {
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Buenos dias.");
                break;
            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("Buenas tardes.");
                break;
            case 21, 22, 23, 24, 1, 2, 3, 4, 5:
                System.out.println("Buenas noches.");
                break;
        }
    }
}

