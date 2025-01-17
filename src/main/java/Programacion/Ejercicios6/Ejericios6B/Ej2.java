package Programacion.Ejercicios6.Ejericios6B;

import java.util.*;

public class Ej2 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList();

        int media, max, min;
        int suma = 0;
        int grandaria = (int) (Math.random() * 11 + 10);

        for (int i = 0; i < grandaria; i++) {
            lista.add((int) (Math.random() * 100));
        }

        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            suma += iterator.next();
        }

        min = Collections.min(lista);
        max = Collections.max(lista);
        media = suma / grandaria;

        System.out.println(lista.toString());
        System.out.println(lista.size());
        System.out.println(min);
        System.out.println(max);
        System.out.println(suma);
        System.out.println(media);

    }
}
