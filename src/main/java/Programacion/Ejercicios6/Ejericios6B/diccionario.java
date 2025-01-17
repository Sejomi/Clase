package Programacion.Ejercicios6.Ejericios6B;

public class diccionario {
    public static final char letras[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ñ'};

    public static boolean comprobar (String cosa){
        boolean comprobar = false;
        for (int i = 0; i < cosa.length(); i++) {
            for (int j = 0; j < letras.length; j++) {
                if (cosa.toLowerCase().charAt(i) == letras[j]) {
                    comprobar = true;
                    break;
                } else {
                    comprobar = false;
                }
            }
            if (!comprobar) {
                break;
            }
        } return comprobar;
    }
}
