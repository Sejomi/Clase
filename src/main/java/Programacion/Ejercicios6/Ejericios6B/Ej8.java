package Programacion.Ejercicios6.Ejericios6B;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> con1 = new HashSet<>();
        HashSet<Integer> con2 = new HashSet<>();
        TreeSet<Integer> con3 = new TreeSet<>();
        TreeSet<Integer> con4 = new TreeSet<>();
        String Scon1 = "";
        String Scon2 = "";
        String numero1 = "";
        String numero2 = "";
        boolean val1 = true;
        boolean val2 = true;

        do {
            if (val1) {
                System.out.println("Introduzca el primer conjunto de numeros: ");
            } else {
                System.out.println("Introduzca un conjunto valido: ");
            }
            Scon1 = sc.next();
            val1 = false;
        } while (!numerosDecimales.comprobar(Scon1) || Scon1.contains(".") || Scon1.charAt(0) == ',' || Scon1.charAt(Scon1.length() - 1) == ',');

        do {
            if (val2) {
                System.out.println("Introduzca el segundo conjunto de numeros: ");
            } else {
                System.out.println("Introduzca un conjunto valido: ");
            }
            Scon2 = sc.next();
            val2 = false;
        } while (!numerosDecimales.comprobar(Scon2) || Scon2.contains(".") || Scon2.charAt(0) == ',' || Scon2.charAt(Scon2.length() - 1) == ',');

        for (int i = 0; i < Scon1.length(); i++) {
            if (Scon1.charAt(i) == ',') {
                con1.add(Integer.parseInt(numero1));
                numero1 = "";
            } else if (i == Scon1.length() - 1) {
                numero1 = numero1 + Scon1.charAt(i);
                con1.add(Integer.parseInt(numero1));
            } else {
                numero1 += Scon1.charAt(i);
            }
        }

        for (int i = 0; i < Scon2.length(); i++) {
            if (Scon2.charAt(i) == ',') {
                con2.add(Integer.parseInt(numero2));
                numero2 = "";
            } else if (i == Scon2.length() - 1) {
                numero2 = numero2 + Scon2.charAt(i);
                con2.add(Integer.parseInt(numero2));
            } else {
                numero2 += Scon2.charAt(i);
            }
        }

        for (Integer i : con1) {
            for (Integer j : con2) {
                if (j == i) {
                    con3.add(j);
                }
                con4.add(j);
            }
            con4.add(i);
        }
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);
        System.out.println(con4);
    }
}
