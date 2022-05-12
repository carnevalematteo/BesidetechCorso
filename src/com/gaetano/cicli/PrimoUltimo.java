package com.gaetano.cicli;

import java.util.Scanner;

public class PrimoUltimo {
    public static void main(String[] args) {
        int [] num = new int[10];
        System.out.println("Inserisci sequenza");
        Scanner in = new Scanner(System.in);
        for(int i=0;i< num.length;i++){
            num[i]= in.nextInt();
        }
        for(int i=0,j= num.length-1 ;i<=(num.length)/2 && j>=(num.length)/2;i++,j--){

            System.out.println(num[i]);
            System.out.println(num[j]);
        }

    }
}
