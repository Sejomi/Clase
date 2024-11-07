package Programacion.EjerciciosT5Extra;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introudzca un día de la semana: ");
        String dia = leer.next();

        while (!dia.equalsIgnoreCase("lunes") && !dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miercoles") && !dia.equalsIgnoreCase("jueves") && !dia.equalsIgnoreCase("viernes")) {
            System.out.println("Introduzca un dia válido: ");
            dia = leer.next();
        }

        switch (dia.toUpperCase()) {
            case "LUNES":
                System.out.println("Sistemas Informátcios");
                break;
            case "MARTES":
                System.out.println("Lenguaje de Marcas");
                break;
            case "MIERCOLES", "JUEVES":
                System.out.println("Entornos de Desarrollo");
                break;
            case "VIERNES":
                System.out.println("Programación");
                break;
        }
    }
}
