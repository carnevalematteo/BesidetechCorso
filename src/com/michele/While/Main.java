package com.While;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input da tastiera
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int x = in.nextInt();

        if(x == 1){
            metodo1();
        } else {
            metodo2();
        }

        /*while (x!= -1){
            System.out.println("Il numero inserito è: " + x);
            System.out.println("Inserisci un numero");
            x = in.nextInt();
        }

        System.out.println("Sono uscito da while");*/

    }

    public static String metodo1(){
        System.out.println("Sono nel metodo 1");
        return "ciao";
    }

    public static void metodo2(){
        System.out.println("Sono nel metodo 2");
    }
}
