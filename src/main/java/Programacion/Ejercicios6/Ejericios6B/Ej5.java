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
        String buscar;
        String eliminar;

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
                    nombre.add(Snombre.toLowerCase());

                    do {

                        if (val4) {
                            System.out.println("Introduzca un numero: ");
                        } else if (!val5) {
                            System.out.println("Ya existe un contacto con este número. Introduzca un número distinto: ");
                        } else {
                            System.out.println("Introduzca un numero válido: ");
                        }
                        Snumero = sc.next();
                        if (numerosEnteros.comprobar(Snumero) && numero.contains(Integer.parseInt(Snumero))) {
                            val5 = false;
                        }
                        val4 = false;

                    } while (!numerosEnteros.comprobar(Snumero) || Snumero.charAt(0) == '-' || Snumero.length() != 9 || numero.contains(Integer.parseInt(Snumero)) || (Snumero.charAt(0) != '9' && Snumero.charAt(0) != '6' && Snumero.charAt(0) != '7'));
                    numero.add(Integer.parseInt(Snumero));
                    break;

                case "2":

                    if (nombre.isEmpty()) {
                        System.out.println("La agenda está vacía.\n");
                    } else {
                        System.out.println("Contactos: \n");
                        for (int i = 0; i < nombre.size(); i++) {
                            System.out.println((i + 1) + ": " + nombre.get(i) + ", " + numero.get(i) + "\n");
                        }
                    }
                    break;

                case "3":

                    if (nombre.isEmpty()) {
                        System.out.println("La agenda está vacía.\n");
                    } else {
                        System.out.println("Introduzca un nombre o número: ");
                        buscar = sc.next();

                        for (String i : nombre) {
                            if (i.equals(buscar.toLowerCase()) || (numerosEnteros.comprobar(buscar) && numero.get(nombre.indexOf(i)) == (Integer.parseInt(buscar)))) {
                                System.out.println(nombre.indexOf(i) + 1 + ": " + i + ", " + numero.get(nombre.indexOf(i)) + "\n");
                                break;
                            } else {
                                System.out.println("No se encontró en la agenda.");
                            }
                        }
                    }
                    break;

                case "4":

                    if (nombre.isEmpty()) {
                        System.out.println("La agenda está vacía.\n");
                    } else {
                        System.out.println("Introduzca un nombre o número: ");
                        eliminar = sc.next();

                        for (int i = 0; i < nombre.size(); i++) {
                            if (nombre.get(i).equals(eliminar.toLowerCase()) || (numerosEnteros.comprobar(eliminar) && numero.get(i) == (Integer.parseInt(eliminar)))) {
                                numero.remove(numero.get(i));
                                nombre.remove(nombre.get(i));
                                break;
                            } else {
                                System.out.println("No se encontró en la agenda.");
                            }
                        }
                    }
                    break;

                case "5":

                    salir = true;
                    break;
            }

        } while (!salir);
    }
}
