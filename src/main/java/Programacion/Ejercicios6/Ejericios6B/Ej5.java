package Programacion.Ejercicios6.Ejericios6B;

import Programacion.Movidas.numerosEnteros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion1 = "";
        List<String> nombre = new ArrayList<>();
        String Snombre = "";
        List<Integer> numero = new ArrayList<>();
        String Snumero = "";
        boolean salir = false;

        do {
            boolean val1 = true;
            boolean val2 = true;
            boolean val3 = true;
            boolean val4 = true;
            boolean val5 = true;

            System.out.print("""
                Agenda de Contactos:
                
                1. Añadir contacto
                2. Ver contactos
                3. Buscar contacto
                4. Eliminar contacto
                5. Salir\n\n""");

            do {
                if (val1) {
                    System.out.println("Elija una opción: ");
                } else {
                    System.out.println("Introduzca una opción válida: ");
                }
                val1 = false;
                opcion1 = sc.next();
            } while (!numerosEnteros.comprobar(opcion1) || opcion1.charAt(0) == '-' || Integer.parseInt(opcion1) > 5 || Integer.parseInt(opcion1) < 1);

            switch (opcion1) {
                case "1":
                    do {

                        if (val2) {
                            System.out.println("Introduzca un nombre: ");
                        } else if (!val3) {
                            System.out.println("Ya existe un contacto con este nombre. Introduzca un nombre distinto: ");
                        } else {
                            System.out.println("Introduzca un nombre válido: ");
                        }
                        Snombre = sc.next();
                        if (nombre.contains(Snombre)) {
                            val3 = false;
                        }
                        val2 = false;

                    } while (!diccionario.comprobar(Snombre) || nombre.contains(Snombre));
                    nombre.add(Snombre);
                    do {
                        if (val4) {
                            System.out.println("Introduzca un numero: ");
                        } else if (!val5) {
                            System.out.println("Ya existe un contacto con este número. Introduzca un número distinto: ");
                        } else {
                            System.out.println("Introduzca un numero válido: ");
                        }
                        Snumero = sc.next();
                        if (numero.contains(Integer.parseInt(Snumero))) {
                            val5 = false;
                        }
                        val4 = false;

                    } while (!numerosEnteros.comprobar(Snumero) || Snumero.charAt(0) == '-' || Snumero.length() != 9 || numero.contains(Integer.parseInt(Snumero)) || (Snumero.charAt(0) != '9' && Snumero.charAt(0) != '8' && Snumero.charAt(0) != '7'));
                    numero.add(Integer.parseInt(Snumero));
                    break;

                case "2":

                    if (nombre.isEmpty()) {
                        System.out.println("La agenda está vacía.\n");
                    } else {
                        System.out.println("Contactos: \n");
                        for (String i : nombre) {
                            for (Integer j : numero) {
                                System.out.println(nombre.indexOf(i) + 1 + ": " + i + ", " + j + "\n");
                                break;
                            }
                        }
                    }
                    break;
            }
            

        } while (!salir);
    }
}
