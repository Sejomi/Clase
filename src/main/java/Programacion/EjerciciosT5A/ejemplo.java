package Programacion.EjerciciosT5A;

public class ejemplo {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabla del " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

    }
}
