package Programacion;

public class numeros {
    public static final char numero[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static boolean comprobar(String cosa) {
        boolean comprobar = false;
        for (int i = 0; i < cosa.length(); i++) {
            for (int j = 0; j < numero.length; j++) {
                if (cosa.charAt(0) == '-'){
                    comprobar = true;
                    break;
                }
                if (cosa.charAt(i) == numero[j]) {
                    comprobar = true;
                    break;
                } else {
                    comprobar = false;
                }
            }
        }
        return comprobar;
    }
}