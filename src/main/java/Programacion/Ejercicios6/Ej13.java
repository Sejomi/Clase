package Programacion.Ejercicios6;

import Programacion.numeros;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = "o";
        String V = "";
        String I = "";
        boolean valid1 = true;
        boolean valid2 = true;
        boolean valid3 = true;

        do {
            if (N.charAt(0) == '-')
                System.out.println("Introduzca un número positivo: ");
            else if (valid1) {
                System.out.println("Introduzca el número de valores: ");
            } else {
                System.out.println("Introduzca un valor válido: ");
            } N = sc.next();
            valid1 = false;
        } while (numeros.comprobar(N) == false || N.charAt(0) == '-');
        int Nnum = Integer.parseInt(N);

        do {
            if (valid2) {
                System.out.println("Introduzca el valor inicial: ");
            } else {
                System.out.println("Introduzca un valor válido: ");
            } V = sc.next();
            valid2 = false;
        } while (numeros.comprobar(V) == false);
        int Vnum = Integer.parseInt(V);

        do {
            if (valid3) {
                System.out.println("Introduzca el número de incremento: ");
            } else {
                System.out.println("Introduzca un valor válido: ");
            } I = sc.next();
            valid3 = false;
        } while (numeros.comprobar(I) == false);
        int Inum = Integer.parseInt(I);

        int yea[] =  new int[Nnum];
        for (int i = 0; i < yea.length; i++) {
            yea[i] = Vnum + (Inum * i);
        }
        System.out.println(Arrays.toString(yea));
    }
}
