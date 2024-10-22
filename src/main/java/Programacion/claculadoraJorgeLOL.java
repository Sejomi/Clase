package Programacion;

import java.util.Scanner;

public class claculadoraJorgeLOL {
    public static void main(String[] args) {

        double num1, num2 = 0;
        String operador = null;

        // Leer numerico 1
        System.out.print("pon algún numerico tt :3 --> ");
        Scanner meter = new Scanner(System.in);
        try {
            num1 = meter.nextDouble();
        } catch (Exception e) {
            System.out.println("te dicho un numerico tt >:(");
        }

        // Leer operador
        System.out.print("ahora la operación ttico :3 --> ");
        try {
            operador = meter.next();
            if (operador=="+") {
                System.out.println("te dicho la operacionnn, no das una >:(");
                }
        } catch (Exception e) {
            System.out.println("te dicho la operacionnn, no das dos >:(");

        }
    }
}
