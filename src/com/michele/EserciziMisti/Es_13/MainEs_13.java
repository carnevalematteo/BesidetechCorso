package com.EserciziMisti.Es_13;

import java.util.Scanner;

public class MainEs_13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        if (!entrambiPrimi(m, n)) {
            System.out.println("non entrambi primi");
        } else if (primiGemelli(m, n)) {
            System.out.println("gemelli");
        } else {
            System.out.println("non gemelli");
        }

    }

    public static boolean primiGemelli(int x, int y) {

        return entrambiPrimi(x, y) && ((x - y == 2) || (y - x == 2));

    }

    public static boolean entrambiPrimi(int x, int y) {
        return eNumeroPrimo(x) && eNumeroPrimo(y);
    }

    public static boolean eNumeroPrimo(int nNew) {
        for (int i = 2; i < nNew; i++) {
            if (nNew % i == 0) {
                return false;
            }
        }
        return true;
    }

}