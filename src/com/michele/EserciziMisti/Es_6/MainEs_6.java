package com.EserciziMisti.Es_6;

import java.util.Scanner;

public class MainEs_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'anno:");
        int anno = in.nextInt();
        System.out.println("Il mese è:");
        tipoMese(anno);
    }

    public static void tipoMese(int mese) {
        if (mese % 4 == 0 && !(mese%100 == 0 && mese%400 == 0) ) {
            System.out.println("BISESTILE");
        } else {
            System.out.println("NON BISESTILE");
        }
    }
}
