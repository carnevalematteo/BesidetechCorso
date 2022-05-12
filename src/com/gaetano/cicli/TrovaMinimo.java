package com.gaetano.cicli;

import java.util.Scanner;

public class TrovaMinimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci dimensione array");
        int dim = in.nextInt();
        int array[] = new int[dim];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(trovaIlMinimo(array));

    }

    public static int trovaIlMinimo(int newArr[] ) {
        int minimo = newArr[0];
        for (int j = 0; j < newArr.length; j++) {
            if (newArr[j] < minimo) {
                minimo = newArr[j];
            }

        }
        return minimo;
    }
}
