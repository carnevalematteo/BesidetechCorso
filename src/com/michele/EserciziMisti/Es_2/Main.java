package com.EserciziMisti.Es_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero A:");
        int A = in.nextInt();
        System.out.println("Inserisci il numero B:");
        int B = in.nextInt();

        if(B!=0){
            System.out.println("Eseguo le operazioni:");
            operazioni(A, B);
        } else {
            System.out.println("B è uguale a 0, non eseguo le operazioni.");
        }

    }

    public static void operazioni(int a, int b) {
            System.out.println("Somma: " + (a + b));
            System.out.println("Differenza: " + (a - b));
            System.out.println("Moltiplicazione: " + (a * b));
            System.out.println("Quoziente: " + (a / b));
            System.out.println("Resto: " + (a % b));

    }


}
