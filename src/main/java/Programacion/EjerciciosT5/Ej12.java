package Programacion.EjerciciosT5;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String genero = null;
        String nombre = null;
        String grupo = null;

        System.out.println("Introduzca su nombre: ");
        nombre = leer.next();

        System.out.println("Introduzca su género (M) o (H): ");
        genero = leer.next();
        while ((genero.toUpperCase().charAt(0) != 'M' && genero.toUpperCase().charAt(0) != 'H') || (genero.length() > 1)) {
            System.out.println("Introduzca un valor válido: ");
            genero = leer.next();

        }
        if (genero.toUpperCase().charAt(0) == 'M' && nombre.toUpperCase().charAt(0) <= 'M' || genero.toUpperCase().charAt(0) == 'H' && nombre.toUpperCase().charAt(0) >= 'N') {
            grupo = "Grupo A";
        } else {
            grupo = "Grupo B";
        }
        System.out.println("Usted corresponde al: " + grupo);
    }

}
