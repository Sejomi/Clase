package Programacion.Ejercicios6.Ejericios6B;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {

        ArrayList Clase = new ArrayList();
        Clase.add("toni");
        Clase.add("fran");
        Clase.add("nunai");
        Clase.add("lol");
        Clase.add("2");
        Clase.add(3);

        for (int i = 0; i < Clase.size(); i++) {
            System.out.println(Clase.get(i));
        }

    }
}
