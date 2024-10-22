package Programacion.EjereciciosT4;

public class Ej1 {
    public static void main(String[] args){

        //1 año son:
        final int dias = 365;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        horas = dias * 24;
        minutos = horas * 60;
        segundos = minutos * 60;

        System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos);
    }
}
