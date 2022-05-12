package com.EserciziMisti.Es_7;

import java.util.Scanner;

public class MainEs_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int num = in.nextInt();
        boolean isMultiplo = false;

        //Intanto prendo come input il primo numero
        //Dopo, entro nel while e faccio il check

        while (num != 5) {
            System.out.println(isMultiplo);
            if (num % 5 == 0) {
                isMultiplo = true;
                System.out.println("Aggiornato a: " + isMultiplo);
            }
            num = in.nextInt();
        }

        if (isMultiplo) {
            System.out.println("almeno1");
        } else {
            System.out.println("no");
        }

    }
}
