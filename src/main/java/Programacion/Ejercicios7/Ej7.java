package Programacion.Ejercicios7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Ej7 {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("", 15);
        inventario.put("Plátanos", 0);
        inventario.put("Peras", 30);
        inventario.put("Naranjas", -10);
        inventario.put("Manzaznas", 50);

        Map<String, Integer> inventario2 = new HashMap<>();
        inventario2.put("Uvas", 15);
        inventario2.put("", -5);
        inventario2.put("Peras", 101);
        inventario2.put("Naranjas", -10);
        inventario2.put("Manzaznas", 50);

        System.out.println("El inventario 1 contiene los siguientes errores: ");
        for (String i : validarInventario(inventario)) {
            System.out.println(i);
        }
        System.out.println("\nEl inventario 2 contiene los siguientes errores: ");

        for (String i : validarInventario(inventario2)) {
            System.out.println(i);
        }
    }
    public static ArrayList<String> validarInventario(Map<String, Integer> inv) {
        ArrayList<String> errores = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inv.entrySet()) {
            if (entry.getKey().isEmpty()) {
                errores.add("\t-> Nombre inválido para un producto con cantidad: " + entry.getValue());
            }
            if (entry.getValue() < 0 || entry.getValue() > 100) {
                errores.add("\t-> Cantidad inválida para el producto: '" + entry.getKey() + "'");
            }
        }

        return errores;
    }
}
