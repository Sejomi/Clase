package Programacion.Ejercicios6.Ejericios6B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej4Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String contrasena;
        String comprobar = "[a-zA-Z]";
        Map<String, String> usuarios = new HashMap();
        usuarios.put("Lolazo", "12345678");

        for (int i = 3; i > 0; i--) {
            if (i == 3) {
                System.out.println("Introduzca usuario y contraseña (tiene 3 intentos)");
            } else {
                System.out.println("Le quedan " + i + " intentos");
            }
            System.out.println("Usuario: ");
            usuario = sc.nextLine();
            System.out.println("Contrasena: ");
            contrasena = sc.nextLine();

            if (usuarios.containsKey(usuario) && contrasena.equals(usuarios.get(usuario))) {
                System.out.println("Ha accedido a la zona restringida.");
                break;
            } else {
                System.out.println("No se puede acceder a la zona restringida.\n");
            }
        }
    }
}
