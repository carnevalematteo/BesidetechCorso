package com.EserciziMisti.Es_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Inserisci il numero N:");
      int N = in.nextInt();
        System.out.println("Eseguo le operazioni:");
        opResto(N);
    }

    public static void opResto(int N){
        String result = N%2==0 ? "pari" : "dispari";
        System.out.println("N è un numero " + result + ".");
    }
}
