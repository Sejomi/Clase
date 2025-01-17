package Programacion.Ejercicios6.Ejercicios6A;

public class Ej8C {
    public static void main(String[] args) {
        int yea[][] = new int[4][10];
        int min[] = new int[4];
        int max[] = new int[4];
        int media[] = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                yea[i][j] = 140 + (int) (Math.random() * ((210 - 140) + 1));
                if (j == 0) {
                    min[i] = yea[i][j];
                    max[i] = yea[i][j];
                }
                if (yea[i][j] > max[i]) {
                    max[i] = yea[i][j];
                } else if (yea[i][j] < min[i]) {
                    min[i] = yea[i][j];
                }
            }

        } for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                media[i] += yea[i][j];
                if (j == 9) {
                    media[i] = media[i] / 10;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                switch (i) {
                    case 0:
                        switch (j) {
                            case 12:
                                System.out.print("\tMED ");
                                break;
                            case 13:
                                System.out.print("MIN ");
                                break;
                            case 14:
                                System.out.print("MAX\n");
                                break;
                            default:
                                System.out.print("\t");
                                break;

                        } break;
                    case 1:
                        switch (j) {
                            case 0:
                                System.out.print("  España: ");
                                break;
                            case 11:
                                System.out.print("| ");
                                break;
                            case 12:
                                System.out.print(media[i -1] + " ");
                                break;
                            case 13:
                                System.out.print(min[i - 1] + " ");
                                break;
                            case 14:
                                System.out.print(max[i - 1] + "\n");
                                break;
                            default:
                                System.out.print(yea[i - 1][j - 1] + " ");
                                break;
                        } break;
                    case 2:
                        switch (j) {
                            case 0:
                                System.out.print("Alemania: ");
                                break;
                            case 11:
                                System.out.print("| ");
                                break;
                            case 12:
                                System.out.print(media[i - 1] + " ");
                                break;
                            case 13:
                                System.out.print(min[i - 1] + " ");
                                break;
                            case 14:
                                System.out.print(max[i - 1] + "\n");
                                break;
                            default:
                                System.out.print(yea[i - 1][j - 1] + " ");

                                break;
                        } break;
                    case 3:
                        switch (j) {
                            case 0:
                                System.out.print(" Francia: ");
                                break;
                            case 11:
                                System.out.print("| ");
                                break;
                            case 12:
                                System.out.print(media[i -1] + " ");
                                break;
                            case 13:
                                System.out.print(min[i - 1] + " ");
                                break;
                            case 14:
                                System.out.print(max[i - 1] + "\n");
                                break;
                            default:
                                System.out.print(yea[i - 1][j - 1] + " ");
                                break;
                        } break;
                    case 4:
                        switch (j) {
                            case 0:
                                System.out.print("  Italia: ");
                                break;
                            case 11:
                                System.out.print("| ");
                                break;
                            case 12:
                                System.out.print(media[i -1] + " ");
                                break;
                            case 13:
                                System.out.print(min[i - 1] + " ");
                                break;
                            case 14:
                                System.out.print(max[i - 1] + "\n");
                                break;
                            default:
                                System.out.print(yea[i - 1][j - 1] + " ");
                                break;
                        } break;
                }
            }
        }
    }
}
