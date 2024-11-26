package Programacion.EjerciciosT5B;

import java.sql.Time;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        String hora = "00:00:00";
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        boolean entry = false;

        char[] abcd = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        do {
            do {
                boolean letra = false;
                entry = (hora.length() == 8 && hora.charAt(2) == ':' && hora.charAt(5) == ':');
                if (entry) {
                    System.out.println("Introduzca una hora (HH:MM:SS): ");
                } else {
                    System.out.println("Introduzca una hora válida (HH:MM:SS): ");
                }
                hora = entrada.next();
                entry = ((hora.length() == 8 && hora.charAt(2) == ':' && hora.charAt(5) == ':'));
                if (entry) {
                    for (int i = 0; i < hora.length(); i++) {
                        for (int j = 0; j < abcd.length; j++) {
                            if (hora.toLowerCase().charAt(i) == abcd[j]) {
                                letra = true;
                            }
                        }
                    }
                    if (letra) {
                        entry = false;
                    } else {
                        entry = true;
                    }
                }
            } while (!entry);

            horas = Integer.parseInt(hora.charAt(0) + "" + hora.charAt(1));
            minutos = Integer.parseInt(hora.charAt(3) + "" + hora.charAt(4));
            segundos = Integer.parseInt(hora.charAt(6) + "" + hora.charAt(7));

        } while (horas >= 24 || minutos >= 60 || segundos >= 60);

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
