package com.gaetano.cicli;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci lunghezza parola");
        int dim = in.nextInt();
        char [] frase = new char[dim];
        System.out.println("Inserisci carattere");
        boolean verifica= true;

        for (int i=0;i<frase.length;i++){
            char c = in.next().charAt(0);
            frase[i]= c;
        }
        for(int i=0;i<frase.length;i++){
            System.out.print(frase[i]);
        }
        System.out.println();
        for (int j=0;j<frase.length/2;j++){
            if(frase[j] != frase [frase.length-1-j]){
                verifica= false;
            }

        }
        if(dim==0){
            System.out.println("Array vuoto");
        }
        else if (verifica){
            System.out.println("Palindromo");
        }
        else{
            System.out.println("No");
        }

    }


}