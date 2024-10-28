package Programacion.EjereciciosT4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.##");
        final double interes = 0.04;
        double balance = 0;
        int cont = 0;
        int ano = 1;
        try {
            System.out.println("Introduce tu balance:");
            balance = datos.nextDouble();
        } catch (Exception e) {
            System.out.println("Introduzca un número válido");
            System.exit(0);
        }
        try {
            System.out.println("Introduzca durante cuantos años tiene dinero en la cuenta:");
            cont = datos.nextInt();
        } catch (Exception e) {
            System.out.println("Introduzca un número válido");
            System.exit(0);
        }

        while (ano <= cont) {
            balance = balance + (balance * interes);
            System.out.println("Balance año " + ano + ": " + (f.format(balance)));
            ano = ano + 1;
        }
    }
}
