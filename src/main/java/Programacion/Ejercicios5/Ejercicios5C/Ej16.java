package Programacion.Ejercicios5.Ejercicios5C;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia1s = null;
        String dia2s = null;
        int dia1 = 0;
        int dia2 = 0;
        int hora1 = 0;
        int hora2 = 0;
        int horasf = 0;
        boolean dia1b = false;
        boolean dia1c = false;
        boolean dia2b = false;
        boolean dia2c = false;
        boolean hora1b = false;
        boolean hora2b = false;

        do {
            if (!dia1c) {
                System.out.println("Ingrese el primer día (1-7, Lunes-Domingo) (Si introduce Domingo, el segundo dia pasara automaticamente a ser Domingo de la semana siguiente): ");
            } else
                System.out.println("Ingrese un primer dia válido (1-7, Lunes-Domingo): ");
            dia1s = sc.next();
            dia1c = true;
            switch (dia1s) {
                case "1", "2", "3", "4", "5", "6", "7", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo":
                    dia1b = true;
                    break;
            }
        } while (!dia1b);

        do {
                if (!hora1b) {
                    System.out.println("Introduzca una hora (H): ");
                } else
                    System.out.println("Introduzca una hora valida (H): ");
                hora1 = sc.nextInt();

                hora1b = true;
        } while (hora1 > 24);

        do {
            if (!dia1s.equals("7") && !dia1s.equals("Domingo")) {
                do {
                    if (!dia2c) {
                        System.out.println("Ingrese el segundo día (1-7, Lunes-Domingo) (Ha de ser posterior al dia anteriormente indicado): ");
                    } else
                        System.out.println("Ingrese un segundo dia valido (1-7, Lunes-Domingo): ");
                    dia2s = sc.next();
                    dia2c = true;
                    switch (dia2s) {
                        case "1", "2", "3", "4", "5", "6", "7", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
                             "Sabado", "Domingo":
                            dia2b = true;
                            break;
                    }
                } while (!dia2b);
            } else {
                dia2s = "7";
            }
            switch (dia1s) {
                case "1", "Lunes":
                    dia1 = 1;
                    dia1s = "lunes";
                    break;
                case "2", "Martes":
                    dia1 = 2;
                    dia1s = "martes";
                    break;
                case "3", "Miercoles":
                    dia1 = 3;
                    dia1s = "miercoles";
                    break;
                case "4", "Jueves":
                    dia1 = 4;
                    dia1s = "jueves";
                    break;
                case "5", "Viernes":
                    dia1 = 5;
                    dia1s = "viernes";
                    break;
                case "6", "Sabado":
                    dia1 = 6;
                    dia1s = "sabado";
                    break;
                case "7", "Domingo":
                    dia1 = 7;
                    dia1s = "domingo";
                    break;
            }
            switch (dia2s) {
                case "1", "Lunes":
                    dia2 = 1;
                    dia2s = "lunes";
                    break;
                case "2", "Martes":
                    dia2 = 2;
                    dia2s = "martes";
                    break;
                case "3", "Miercoles":
                    dia2 = 3;
                    dia2s = "miercoles";
                    break;
                case "4", "Jueves":
                    dia2 = 4;
                    dia2s = "jueves";
                    break;
                case "5", "Viernes":
                    dia2 = 5;
                    dia2s = "viernes";
                    break;
                case "6", "Sabado":
                    dia2 = 6;
                    dia2s = "sabado";
                    break;
                case "7", "Domingo":
                    dia2 = 7;
                    dia2s = "domingo";
                    break;
            }
        } while (dia1 >= dia2 && dia1 != 7);
        do {
            if (!hora2b) {
                System.out.println("Introduzca una hora (H): ");
            } else
                System.out.println("Introduzca una hora valida (H): ");
            hora2 = sc.nextInt();
            hora2b = true;
        } while (hora2 > 24);

        if (dia1 != 7 || dia2 != 7) {
            horasf = (24 - hora1) + 24 * (dia2 - dia1 - 1) + hora2;
        } else {
            horasf = (24 - hora1) + 24 * (7 - 1) + hora2;
        }

        System.out.println("Entre las " + hora1 + ":00h del " + dia1s + " y las " + hora2 + ":00h del " + dia2s + " hay " + horasf + " hora/s.");
    }
}
