package Programacion.EjerciciosT5;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {

        String clave = "TheBest";
        String clave2 = null;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca la contraseña: ");
        clave2 = leer.next();

        if (clave.toUpperCase().equals(clave2.toUpperCase())) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }



    }
}
