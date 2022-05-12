package com.EserciziMisti.Es_5;

import java.util.Scanner;

public class MainEs_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci il numero A:");
        int A = in.nextInt();
        System.out.println("Inserisci il numero B:");
        int B = in.nextInt();
        System.out.println("Inserisci il numero C:");
        int C = in.nextInt();

        System.out.println("Ecco i seguenti numeri: " + A + ", " + B + ", " + C);
        System.out.println("Risultato");
        operazioni(A, B, C);
    }

    public static void operazioni(int A, int B, int C) {
        if (A < (B + C) && B < (C + A) && C < (A + B)) {
            if (A == B && B == C) {
                System.out.println("TRIANGOLO EQUILATERO");
            } else if (A == B || B == C || C == A) {
                System.out.println("TRIANGOLO ISOSCELE");
            } else {
                System.out.println("TRIANGOLO SCALENO");
            }

        } else {
            System.out.println("NO");
        }
    }
}
