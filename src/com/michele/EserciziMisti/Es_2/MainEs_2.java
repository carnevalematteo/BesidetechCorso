package com.EserciziMisti.Es_2;

import java.util.Scanner;

public class MainEs_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero A:");
        int a = in.nextInt();
        System.out.println("Inserisci il numero B:");
        int b = in.nextInt();

        while(b==0){
            System.out.println("Numero non valido. Inserisci in B un numero diverso da 0: ");
            b = in.nextInt();
        }
        //Metodo con void
        // operazioni(a,b);

        //Metodo con return
        System.out.println(operazioniNew(a, b));

    }

    //Metodo con void
    public static void operazioni(int aP, int bP) {
        System.out.println("Somma: " + (aP+bP));
        System.out.println("Differenza: " + (aP-bP));
        System.out.println("Moltiplicazione: " + (aP*bP));
        System.out.println("Quoziente: " + (aP/bP));
        System.out.println("Resto: " + (aP%bP));
    }

    //Metodo con return
    public static String operazioniNew(int aP, int bP){
        return  "Somma: " + (aP+bP) + "\n" +
                "Differenza: " + (aP-bP) + "\n" +
                "Moltiplicazione: " + (aP*bP) + "\n" +
                "Quoziente: " + (aP/bP) + "\n" +
                "Resto: " + (aP%bP);
    }
}
