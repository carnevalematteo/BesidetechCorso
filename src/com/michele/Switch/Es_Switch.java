package com.Switch;

import java.util.Scanner;

public class Es_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una marca auto:");
        String marca = in.nextLine().toLowerCase();

        switch (marca) {
            case "tesla":
                System.out.println("Prezzo Tesla: 80803$");
                break;
            case "mercedes":
                System.out.println("Prezzo Mercedes: 90503$");
                break;
            case "bmw":
                System.out.println("Prezzo BMW: 49653$");
                break;
            case "audi":
                System.out.println("Prezzo Audi: 56536$");
                break;
            case "honda":
                System.out.println("Prezzo Honda: 4085$");
                break;
            case "porsche":
                System.out.println("Prezzo Porsche: 300036$");
                break;
            default:
                System.out.println("Inserisci una marca valida.");
                break; //appending break (in caso aggiungessi un nuovo "case");
        }
    }
}
