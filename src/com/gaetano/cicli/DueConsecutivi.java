package com.gaetano.cicli;

import java.util.Scanner;

public class DueConsecutivi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire la capacità dell'array: ");

        int length = in.nextInt();
        boolean verifica= false;
        int[] sequenza = new int[length];

        for (int i=0; i < length; i++) {
            sequenza[i] = in.nextInt();  // salvo gli elementi nell'array di lunghezza length
        }
        for (int i=0; i < length-1; i++) {
            if (sequenza[i] == (sequenza[i + 1] + 1)) {
                verifica = true;
            }
        }
        if (verifica){
            System.out.println("Verificato");
        }



    }
}

    

