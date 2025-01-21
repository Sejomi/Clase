package Programacion.Ejercicios6.Ejericios6B;

import java.util.*;

public class Ej2Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        String[] frasePartia = frase.split(" ");
        Map<String, ArrayList<Integer>> palabras = new HashMap<>();

        for (int i = 0; i < frasePartia.length; i++) {
            if (!palabras.containsKey(frasePartia[i])) {
                palabras.put(frasePartia[i], new ArrayList<>());
            } else {
                palabras.get(frasePartia[i]).add(i);
            }
        }
        System.out.println(palabras);
    }
}
