package Programacion.Ejercicios7.Practicar;

import java.security.KeyStore;
import java.util.*;

public class NiggasAdventure {
    public static void main(String[] args) {
        System.out.println(menu());
    }

    public static String menu() {
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean val1 = true;

        do {
            System.out.println("\n" +
                    "\u001B[31m\n" +
                    "███▄▄▄▄    ▄█     ▄██████▄     ▄██████▄     ▄████████    ▄████████         ▄████████ ████████▄   ▄█    █▄     ▄████████ ███▄▄▄▄       ███     ███    █▄     ▄████████    ▄████████ \n" +
                    "███▀▀▀██▄ ███    ███    ███   ███    ███   ███    ███   ███    ███        ███    ███ ███   ▀███ ███    ███   ███    ███ ███▀▀▀██▄ ▀█████████▄ ███    ███   ███    ███   ███    ███ \n" +
                    "███   ███ ███▌   ███    █▀    ███    █▀    ███    ███   ███    █▀         ███    ███ ███    ███ ███    ███   ███    █▀  ███   ███    ▀███▀▀██ ███    ███   ███    ███   ███    █▀  \n" +
                    "███   ███ ███▌  ▄███         ▄███          ███    ███   ███               ███    ███ ███    ███ ███    ███  ▄███▄▄▄     ███   ███     ███   ▀ ███    ███  ▄███▄▄▄▄██▀  ▄███▄▄▄     \n" +
                    "███   ███ ███▌ ▀▀███ ████▄  ▀▀███ ████▄  ▀███████████ ▀███████████      ▀███████████ ███    ███ ███    ███ ▀▀███▀▀▀     ███   ███     ███     ███    ███ ▀▀███▀▀▀▀▀   ▀▀███▀▀▀     \n" +
                    "███   ███ ███    ███    ███   ███    ███   ███    ███          ███        ███    ███ ███    ███ ███    ███   ███    █▄  ███   ███     ███     ███    ███ ▀███████████   ███    █▄  \n" +
                    "███   ███ ███    ███    ███   ███    ███   ███    ███    ▄█    ███        ███    ███ ███   ▄███ ███    ███   ███    ███ ███   ███     ███     ███    ███   ███    ███   ███    ███ \n" +
                    " ▀█   █▀  █▀     ████████▀    ████████▀    ███    █▀   ▄████████▀         ███    █▀  ████████▀   ▀██████▀    ██████████  ▀█   █▀     ▄████▀   ████████▀    ███    ███   ██████████ \n" +
                    "                                                                                                                                                           ███    ███              \n 彼ら全員を殺してください\n\n\u001B[33m1. -> AÑADIR JUGADOR\n2. -> SALIR \n\u001B[34m");
            if (val1)
                System.out.println("Choose an option: ");
            else
                System.out.println("Choose a valid option: ");
            entrada = sc.nextLine();
            val1 = false;
        } while (!entrada.equals("1") && !entrada.equals("2") && !entrada.equals("3") && !entrada.equals("4") && !entrada.equals("5"));

        switch (entrada) {
            case "1":
                return String.valueOf(jugadoresNuevo());
            case "2":

        } return null;
    }

    public static HashMap jugadoresNuevo () {
        HashMap <String, HashMap> jugadores = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean val1 = true;
        boolean val2 = false;

        do {
            if (val2)
                System.out.println("Este nombre ya existe, introduzca uno válido: ");
            else if (val1)
                System.out.println("Introduzca un nombre: ");
            else
                System.out.println("Introduzca un numbre válido: ");
            val1 = false;
            nombre = sc.nextLine();
            if (jugadores.containsKey(nombre.toLowerCase()))
                val2 = true;
        } while(nombre.isEmpty() || jugadores.containsKey(nombre.toLowerCase()));

        jugadores.put(nombre, new HashMap<>());

        System.out.println("Introduzca un apodo dentro del juego: ");
        jugadores.get(nombre).put("Nombre", sc.nextLine());
        String clase = "";
        System.out.println("Elija una clase:\n\n " +
                "\u0018[35m1. --> Pícaro" +
                "2. --> Bardo" +
                "3. --> Guerrero" +
                "4. --> Clérigo" +
                "5. --> Hechicero");
        boolean val3 = true;
        do {
            switch (sc.nextLine()) {
                case "1":
                    clase = "Pícaro";
                    break;
                case "2":
                    clase = "Bardo";
                    break;
                case "3":
                    clase = "Guerrero";
                    break;
                case "4":
                    clase = "Clérigo";
                    break;
                case "5":
                    clase = "Hechicero";
                    break;
                default:
                    System.out.println("Introduzca un número válido: ");
                    val3 = false;
                    break;
            }
        } while (!val3);

        jugadores.get(nombre).put("Clase", clase);

        jugadores.get(nombre).put("Atributos", new HashMap<String, Integer>());
        jugadores.get(nombre).get("Atributos");

        return jugadores;
    }
}
