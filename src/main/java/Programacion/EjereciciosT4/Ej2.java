package Programacion.EjereciciosT4;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double res1 = 0;
        int mult = 1;
        double num1 = 0;
        int cont = 1;
        Scanner numerete = new Scanner(System.in);

        System.out.println("pon un numerete: ");
        num1 = numerete.nextDouble();

        while (cont <= 10) {
            res1 = num1 * mult;
            System.out.println(num1 + " * " + mult + " = " + res1);
            cont = cont + 1;
            mult = mult + 1;
        }
    }
}