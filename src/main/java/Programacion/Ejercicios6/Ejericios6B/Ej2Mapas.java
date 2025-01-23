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
            }
            palabras.get(frasePartia[i]).add(i);
        }
        for (Map.Entry<String, ArrayList<Integer>> entry : palabras.entrySet()) {
            System.out.print(entry.getKey() + "= ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (i == entry.getValue().size() - 1) {
                    System.out.print(entry.getValue().get(i) + "\n");
                }
                else {
                    System.out.print(entry.getValue().get(i) + ", ");
                }
            }
        }
    }
}
