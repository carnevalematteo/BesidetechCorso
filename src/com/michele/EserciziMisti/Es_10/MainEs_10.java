package com.EserciziMisti.Es_10;

import java.util.Scanner;

public class MainEs_10 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo:");
        int n = in.nextInt(); //Esempio 12345
        System.out.println("L'operazione (n-nInv) è pari a:" + operazione(n));
    }

    public static int operazione(int nNew) {
         int nCopia = nNew;
         int lastNum;
         int nInv = 0; //reversed

        while(nNew!=0) {
            lastNum = nNew%10; //Esempio 5
            nNew/=10; //Aggiorna nNew
            nInv = (nInv*10) + lastNum;

            System.out.println("nInv is: " + nInv);
        }

        return nCopia-nInv;
    }
}
