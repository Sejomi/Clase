package Programacion.Ejercicios7;

import java.util.*;

public class Ej5 {
    public static void main(String[] args) {
        String[] palabras = {"auto", "elefante", "iglesia", "oso", "uva", "abeja"};

        System.out.println("Palabras agrupadas por vocal inicial:");

        for (Map.Entry<Character, ArrayList> i : filtrarPorVocal(palabras).entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
            }
        }

    public static Map<Character, ArrayList> filtrarPorVocal(String[] palabras) {
        Map<Character, ArrayList> pagrupadas = new HashMap<>();

        for (String i : palabras) {
            if (!pagrupadas.containsKey(i.charAt(0)))
                pagrupadas.put(i.charAt(0), new ArrayList<>());

            pagrupadas.get(i.charAt(0)).add(i);
        }
        return pagrupadas;
    }
}
