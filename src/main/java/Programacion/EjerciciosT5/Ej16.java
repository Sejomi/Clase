package Programacion.EjerciciosT5;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota = 0;

        System.out.println("Escriba su nota: ");
        nota = leer.nextInt();

        switch (nota){
            case 0, 1, 2:
                System.out.println("Muy Deficiente");
                break;
            case 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6, 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
        }
    }
}
