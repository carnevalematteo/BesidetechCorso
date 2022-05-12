package com.EserciziMisti.Es_11;

import java.util.Scanner;

public class MainEs_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int n = in.nextInt();
        numbSize(n);
    }

    public static void numbSize(int nNew) {
        int single = 0;
        boolean foundZero = false;

        if (nNew != 0) {
            while (nNew > 0) {
                single = nNew % 10;
                nNew = nNew / 10;

                if (single == 0) {
                    foundZero = true;
                }
            }
            if (foundZero) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        } else {
            System.out.println("NO");
        }

    }

}
