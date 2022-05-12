package com.EserciziMisti.Es_9;

import java.util.Scanner;

public class MainEs_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        // In questo modo associo un primo valore a num
        int num = in.nextInt();
        int counter = 0;

        while(num!=0){

            //Controllo se il numero è dispari ed è divisibile per 3
            if(!(num%2==0) && num%3==0){
               counter++;
            }

            num = in.nextInt();
        }

        System.out.println(counter);
    }
}
