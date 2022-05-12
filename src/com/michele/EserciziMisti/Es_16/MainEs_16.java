package com.EserciziMisti.Es_16;

import java.util.Scanner;

public class MainEs_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci numero intero X:");
        int x = in.nextInt();
        int counter = 0;
        boolean prop = false;

        while (x < 0) {
            x = in.nextInt();
        }

        System.out.println("Inserisci una sequenza di numeri interi:");
        int num = in.nextInt();

        while (num != -1) {
            if(num == 0){
                counter++;
                if(counter == x){
                    prop = true;
                }
            } else {
                counter = 0;
            }
            num = in.nextInt();
        }

        String res = prop ? "OK" : "NO";
        System.out.println(res);

    }
}
