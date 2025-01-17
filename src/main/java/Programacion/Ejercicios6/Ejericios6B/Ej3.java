package Programacion.Ejercicios6.Ejericios6B;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> datos = new ArrayList();
        List<Integer> datossort1 = new ArrayList();
        List<Integer> datossort2 = new ArrayList();

        int valor = 0;
        int valorposition = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número " + (i + 1) + ": ");
            datos.add(sc.nextInt());
            datossort1.add(datos.get(i));
        }
        System.out.println("Lista original: " + datos);

        while (datossort1.size() > 0) {
            for (int i = 0; i < datossort1.size(); i++) {
                if (i == 0) {
                    valor = datossort1.getFirst();
                    valorposition = 0;
                }
                else if (valor > datossort1.get(i)) {
                    valor = datossort1.get(i);
                    valorposition = i;
                }
            }
            datossort2.add(valor);
            datossort1.remove(valorposition);
        } System.out.println("Lista ordenada: " + datossort2);
    }
}
