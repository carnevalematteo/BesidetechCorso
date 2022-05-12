package com.EserciziMisti.Es_4;

import java.util.Scanner;

public class MainEs_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il voto conseguito all'esame di Fondamenti:");
        int voto = in.nextInt();
        System.out.println("Il tuo voto è: " + voto + ".");
        esitoEsame(voto);
    }

    public static void esitoEsame(int N){
        if(N<0 || N > 30){
            System.out.println("VOTO NON VALIDO");
        } else if (N >= 18){
            System.out.println("ESAME SUPERATO");
        } else {
            System.out.println("BOCCIATO");
        }
    }
}
