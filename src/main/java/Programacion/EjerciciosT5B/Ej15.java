package Programacion.EjerciciosT5B;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        String hora = null;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        System.out.println("Introduzca la hora (HH:MM:SS): ");
        hora = entrada.next();
        horas = Integer.parseInt(hora.charAt(0) + "" + hora.charAt(1));
        minutos = Integer.parseInt(hora.charAt(3) + "" + hora.charAt(4));
        segundos = Integer.parseInt(hora.charAt(6) + "" + hora.charAt(7));

        while (horas >= 24 || minutos >= 60 || segundos >= 60) { System.out.println("Introduzca una hora válida (HH:MM:SS): ");
            hora = entrada.next();
            horas = Integer.parseInt(hora.charAt(0) + "" + hora.charAt(1));
            minutos = Integer.parseInt(hora.charAt(3) + "" + hora.charAt(4));
            segundos = Integer.parseInt(hora.charAt(6) + "" + hora.charAt(7));
        }

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            } if (minutos == 60) {
                minutos = 0;
                horas++;
            } if (horas == 24) {
                horas = 0;
            }
            hora = df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos);

            System.out.println(hora);
        }
    }
}