package Programacion;

import java.util.Scanner;

public class claculadoraJorgeLOL {
    public static void main(String[] args) {

        double num1 = 0, num2 = 0;
        Scanner meter = new Scanner(System.in);
        double res1 = 0;
        String operador = "";

            // Leer numerico 1
            System.out.print("pon algún numerico tt :3 --> ");

            try {
            num1 = meter.nextDouble();
            } catch (Exception e) {
                System.out.println("te dicho un numerico tt >:(");
                System.exit(0);
            }

            // Leer operador
            System.out.print("ahora la operación ttico :3 --> ");
            operador = meter.next();

            if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
                }
            else {
                System.out.println("te dicho la operacionnn, no das una >:(");
                System.exit(0);
            }

            // Leer numerico 2
            System.out.print("pon otro numerico tt :3 --> ");

            try {
                num2 = meter.nextDouble();
            } catch (Exception e) {
                System.out.println("te dicho un numerico tt >:(");
                System.exit(0);
            }

            // Calcular
            if (operador.equals("+")) {
                res1 = num1 + num2;
            } else if (operador.equals("-")) {
                res1 = num1 - num2;
            } else if (operador.equals("*")) {
                res1 = num1 * num2;
            } else if (operador.equals("/")) {
                if (num2 == 0) {
                    System.out.println("no se puede dividr entre 0 espabilao");
                    System.exit(0);
                }
                res1 = num1 / num2;
            }

        System.out.println("aqui lo llevas tticoo: " + res1);


    }
}
