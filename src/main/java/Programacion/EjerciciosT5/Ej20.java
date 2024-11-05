package Programacion.EjerciciosT5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre = null;
        double ht = 0;
        double tph = 0;
        double impB = 0;
        double impN = 0;
        double tax = 0;
        DecimalFormat f = new DecimalFormat(".##");

        System.out.println("Introduzca su nombre: ");
        nombre = leer.next();
        System.out.println("Introduzca las horas que ha trabajado: ");
        ht = leer.nextDouble();
        System.out.println("Introduzca la tarifa por hora: ");
        tph = leer.nextDouble();

        if (ht < 35) {
            impB = ht * tph;
            if (impB > 900) {
                tax = 0.45 * (impB - 900) + (0.25 * 400);
            } else if (impB > 500) {
                tax = 0.25 * (impB - 500);
            } else {
                tax = 0;
            }

        } else {
            impB = 1.5 * (ht * tph);
            if (impB > 900) {
                tax = 0.45 * (impB - 900) + (0.25 * 400);
            } else if (impB > 500) {
                tax = 0.25 * (impB - 500);
            } else {
                tax = 0;
            }
        }
        impN = impB - tax;
        System.out.println("Por las " + ht + " horas trabajadas, a " + nombre + " le corresponde un salario bruto de " + f.format(impB) + "€ y un neto de " + f.format(impN) + "€ tras aplicar " + f.format(tax) + "€ de impuestos.");
    }
}
