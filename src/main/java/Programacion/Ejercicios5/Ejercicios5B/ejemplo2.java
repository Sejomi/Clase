package Programacion.Ejercicios5.Ejercicios5B;

public class ejemplo2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabla del " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                if (j % 2 == 0)
                    System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

    }
}
