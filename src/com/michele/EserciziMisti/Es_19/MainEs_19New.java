package com.EserciziMisti.Es_19;

import java.util.Scanner;

public class MainEs_19New {
    static boolean contieneCifra = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un carattere alfanumerico:");
        char carattere = in.next().charAt(0);

        while (!(carattere == '*')) {
            checkNum(carattere);
            carattere = in.next().charAt(0);
        }

        if (contieneCifra) {
            System.out.println("ALMENO UNA");
        } else {
            System.out.println("NESSUNA");
        }
    }

    public static boolean checkNum(char carattereP) {
        if (carattereP >= '0' && carattereP <= '9') {
            contieneCifra = true;
            return contieneCifra;
        }
        return contieneCifra;

    }
}
