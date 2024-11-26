package Programacion.EjerciciosT5B;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia1 = null;
        String dia2 = null;
        boolean dia1b = false;

        do {
            if (dia1b == false) {
                System.out.println("Ingrese el primer día (1-7, Lunes-Domingo): ");
            } else
                System.out.println("Ingrese un valor válido (1-7, Lunes-Domingo)");
            dia1 = sc.next();
            switch (dia1) {
                case "1":
                    dia1b = true;
                    break;
                case "2":
                    dia1b = true;
                    break;
                case "3":
                    dia1b = true;
                    break;
                case "4":
                    dia1b = true;
                    break;
                case "5":
                    dia1b = true;
                    break;
                case "6":
                    dia1b = true;
                    break;
                case "7":
                    dia1b = true;
                    break;
                case "Lunes":
                    dia1b = true;
                    break;
                case "Martes":
            }
        } while (!dia1b);
    }
}
