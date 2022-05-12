package com.EserciziMisti.Es_7;

import java.util.Scanner;

public class MainEs_7New {

    static boolean contieneMultiplo = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (!(num == 5)) {
            if (isMultiplo(num)) {
                contieneMultiplo = true;
            }
            num = in.nextInt();
        }

        String result = contieneMultiplo ? "ALMENO 1" : "NESSUNO";
        System.out.println(result);
    }

    public static boolean isMultiplo(int numP) {
        if (numP % 5 == 0) {
            return true;
        }
        return false;
    }
}
