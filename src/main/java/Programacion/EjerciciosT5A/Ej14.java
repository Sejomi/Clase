package Programacion.EjerciciosT5A;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bill500 = 0;
        int bill200 = 0;
        int bill100 = 0;
        int bill50 = 0;
        int bill20 = 0;
        int bill10 = 0;
        int bill5 = 0;

        System.out.println("Introduzca una cifra en euros (divisible entre 5): ");
        int moni = entrada.nextInt();

        while (moni % 5 != 0) {
            System.out.println("Introduzca una cifra válida: ");
            moni = entrada.nextInt();

        } while (moni != 0) {
            if (moni / 500 >= 1) {
                bill500 = moni / 500;
                moni = moni - bill500 * 500;
            } else if (moni / 200 >= 1) {
                bill200 = moni / 200;
                moni = moni - bill200 * 200;
            } else if (moni / 100 >= 1) {
                bill100 = moni / 100;
                moni = moni - bill100 * 100;
            } else if (moni / 50 >= 1) {
                bill50 = moni / 50;
                moni = moni - bill50 * 50;
            } else if (moni / 20 >= 1) {
                bill20 = moni / 20;
                moni = moni - bill20 * 20;
            } else if (moni / 10 >= 1) {
                bill10 = moni / 10;
                moni = moni - bill10 * 10;
            } else if (moni / 5 >= 1) {
                bill5 = moni / 5;
                moni = moni - bill5 * 5;
            }
        } if (bill500 != 0){
        System.out.println("Billetes de 500€: " + bill500);}
        if (bill200 != 0){
        System.out.println("Billetes de 200€: " + bill200);}
        if (bill100 != 0){
        System.out.println("Billetes de 100€: " + bill100);}
        if (bill50 != 0){
        System.out.println("Billetes de 50€: " + bill50);}
        if (bill20 != 0){
        System.out.println("Billetes de 20€: " + bill20);}
        if (bill10 != 0){
        System.out.println("Billetes de 10€: " + bill10);}
        if (bill5 != 0){
        System.out.println("Billetes de 5€: " + bill5);}
    }
}
