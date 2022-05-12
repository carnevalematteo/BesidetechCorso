package com.EserciziMisti.Es_12;

import java.util.Scanner;

public class MainEs_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero positivo: ");
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("SI");
        } else if (n > 0) {
            String result = eNumeroPrimo(n) ? "SI" : "NO";
            System.out.println(result);
        } else {
            System.out.println("Numero non valido. Inserisci un numero positivo: ");
            n = in.nextInt();
        }
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
