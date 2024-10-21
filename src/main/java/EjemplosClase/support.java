package EjemplosClase;

public class support {
    public static void main(String[] args) {
        double k = (7 * Math.random()) + 0;

        double d = (17 * Math.random()) + 0;

        double a = (30 * Math.random()) + 0;

        System.out.println((int)k + "/" + (int)d + "/" + (int)a);

        if (d == 0);
                d = 1;

        double kda = ((k + a) / d);

        System.out.println("KDA = " + kda);

    }
}
