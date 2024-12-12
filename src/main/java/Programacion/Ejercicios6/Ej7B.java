package Programacion.Ejercicios6;

import Programacion.numerosDecimales;

import java.util.Scanner;

public class Ej7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String precio;
        String euros = "";
        String centimos = "";
        int largoeuros = 0;
        boolean val1 = true;

        do {
            if (val1){
                System.out.print("Introduzca un precio: ");
            } else {
                System.out.println("Introduzca un precio valido: ");
            }
            precio = sc.next();
            val1 = false;
        } while (!numerosDecimales.comprobar(precio));
        for (int i = 0; i < precio.length(); i++) {
            if (precio.charAt(i) == ',' || precio.charAt(i) == '.'){
                largoeuros = i;
                break;
            } else {
                largoeuros = euros.length();
            } if (i == precio.length() - 1) {
                centimos = "0";
            }
            euros += precio.charAt(i);
        } for (int i = largoeuros + 1; i < precio.length(); i++) {
            centimos += precio.charAt(i);
        }
        System.out.println("Euros: " + euros);
        System.out.println("Centimos: " + centimos);
    }
}
