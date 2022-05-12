package com.Eccezioni.Es_2;

import java.util.Scanner;

public class MainEs_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try {
            ageControl(age);
        } catch (Exception e) {
            System.out.println("A problem occured: " + e);
        }
    }

    //Necessito di un metodo che lancia l'eccezione personalizzata
    public static void ageControl(int ageNew) throws AgeException {
        if (ageNew < 18) {
            //Se la condizione viene soddisfatta allora
            // lanci l'eccezione.
            //Viene lanciata
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else if (ageNew == 50) {
            throw new AgeException("\n"+"Age is 50, slow down cowboy!");
        } else {
            //Non viene lanciata
            System.out.println("You are now signed up!");
        }
    }
}
