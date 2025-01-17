package Programacion.Movidas;

import javax.swing.*;
import java.util.Scanner;

public class claculadoraJorgeLOLInterfaces {
    public static void main(String[] args) {

        Scanner meter = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        double res1 = 0;
        String operador = "";

            // Leer numerico 1


            try {
                num1 = (double) JOptionPane.showInputDialog(null, "pon algún numerico tt :3", "Calculadora",JOptionPane.INFORMATION_MESSAGE,null,null,null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "te dicho un numerico tt >:(");
                System.exit(0);
            }

            // Leer operador
        operador = (String) JOptionPane.showInputDialog(null, "ahora la operación ttico :3", "calculadora", JOptionPane.INFORMATION_MESSAGE, null, null, null);

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
