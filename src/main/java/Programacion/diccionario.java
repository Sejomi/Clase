package Programacion;

public class diccionario {
    public static final char nums[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ñ'};
    public static boolean comprobar (String cosa){
        boolean comprobar = true;
        for (int i = 0; i < cosa.length(); i++){
            if (cosa.charAt(i) != nums[i]){
                comprobar = false;
            }
        } return comprobar;
    }
}
