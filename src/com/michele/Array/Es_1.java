package com.Array;

import java.util.Arrays;

public class Es_1 {
    public static void main(String[] args) {
        int[] sequenza = new int[10];

        for(int i = 0; i < sequenza.length; i++){
            sequenza[i] = i+1;
            //Metodo 1
            //System.out.println(sequenza[i]);
        }

        //Metodo 2
        System.out.println(Arrays.toString(sequenza));
    }
}
