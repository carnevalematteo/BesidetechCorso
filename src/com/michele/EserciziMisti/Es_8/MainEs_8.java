package com.EserciziMisti.Es_8;

import java.util.Scanner;

public class MainEs_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero x:");
        int x = in.nextInt();
        System.out.println("Inserisci il numero y:");
        int y = in.nextInt();
        System.out.println("La somma di tutti i numeri dispari compresi tra x e y è pari a:");
        //sommaDispari(x, y);

        System.out.println(sommaDispari2(x, y));

    }

    //Metodo con void
    public static void sommaDispari(int num1, int num2) {
        int sum = 0;

        if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                if (!(i % 2 == 0)) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } else {
            System.out.println("Non eseguo operazione.");
        }
    }

    //Metodo con int
    public static int sommaDispari2(int num1, int num2) {

        int sum = 0;

        if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                if (!(i % 2 == 0)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

}
