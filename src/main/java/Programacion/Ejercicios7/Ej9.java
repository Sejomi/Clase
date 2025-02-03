package Programacion.Ejercicios7;

import java.util.ArrayList;

public class Ej9 {
    public static void main(String[] args) {
        String[] palabras = {"ana", "oso", "programa", "radar", "java", "mamam"};
        System.out.println("Palabras palíndromas: " + encontrarPalindromas(palabras));

    }
    public static ArrayList<String> encontrarPalindromas(String[] palabras) {
       ArrayList<String> palindromas = new ArrayList<>();
        for (String palabra : palabras) {
           if (esPalindromo(palabra)) {
               palindromas.add(palabra);
           }
       }
        return palindromas;
    }
    public static boolean esPalindromo(String palabra) {
        String palindromoComp = "";
        for (int i = palabra.length(); i > 0; i--) {
            palindromoComp += palabra.charAt(i - 1);
        }
        return palindromoComp.equals(palabra);
    }
}
