package Programacion.Ejercicios6.Ejercicios6A;

public class Ej8CDianimco {
    public static void main(String[] args) {

        final String paises[] = {"España", "Alemania", "Francia", "Italia"};
        final int quantAlturas = 10;
        final int altMaxR = 210;
        final int altMinR = 140;

        int alturas[][] = new int[paises.length][quantAlturas];

        int min[] = new int[paises.length];
        int max[] = new int[paises.length];
        int media[] = new int[paises.length];

        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < quantAlturas; j++) {
                alturas[i][j] = altMinR + (int) (Math.random() * ((altMaxR - altMinR) + 1));
                if (j == 0) {
                    min[i] = alturas[i][j];
                    max[i] = alturas[i][j];
                }
                if (alturas[i][j] > max[i]) {
                    max[i] = alturas[i][j];
                } else if (alturas[i][j] < min[i]) {
                    min[i] = alturas[i][j];
                }
            }
        }

        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < quantAlturas; j++) {
                media[i] += alturas[i][j];
                if (j == quantAlturas - 1) {
                    media[i] = media[i] / quantAlturas;
                }
            }
        }

        for (int i = 0; i < paises.length + 1; i++) {
            for (int j = 0; j < quantAlturas + 4; j++) {
                if (i == 0) {
                    if (j == quantAlturas + 1) {
                        System.out.print("\tMED ");
                    } else if (j == quantAlturas + 2) {
                        System.out.print("MIN ");
                    } else if (j == quantAlturas + 3) {
                        System.out.print("MAX\n");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 0) {
                        System.out.print(paises[i - 1] + ": ");
                    } else if (j == quantAlturas) {
                        System.out.print("| ");
                    } else if (j == quantAlturas + 1) {
                        System.out.print(media[i - 1] + " ");
                    } else if (j == quantAlturas + 2) {
                        System.out.print(min[i - 1] + " ");
                    } else if (j == quantAlturas + 3) {
                        System.out.print(max[i - 1] + "\n");
                    } else {
                        System.out.print(alturas[i - 1][j] + " ");
                    }
                }
            }
        }


    }
}
