package Programacion.Ejercicios5.Ejercicios5C;

import java.util.Scanner;

public class j14jorge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String piramide = "";
        System.out.print("Introduce la altura de la piramide: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el carácter de relleno: ");
        String caracter = sc.next();

        for (int b = altura - 1, c = 0; b >= 0; b--, c++) {
            for (int i = 0; i < b; i++) {
                System.out.print(" ");
            }
            if (b == 0) {
                for (int i = 0; i < altura * 2 - 1; i++) {
                    System.out.print(caracter);
                }
                break;
            }
            if (b == altura - 1) {
                System.out.print(caracter);
            } else {
                System.out.print(caracter);
                if (b == altura - 2) {
                    for (int j = 1; j <= c; j++)
                        System.out.print(" ");
                    System.out.print(caracter);
                } else {
                    if (c % 2 == 0) {
                        c++;
                        for (int j = 1; j <= c; j++) {
                            System.out.print(" ");
                        }
                    } else {
                        c += 2;
                        for (int j = 1; j <= c + 2; j++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(caracter);
                }
            }
            System.out.println();
        }
    }
}
