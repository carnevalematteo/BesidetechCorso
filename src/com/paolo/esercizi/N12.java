package esercizi;

import java.util.Scanner;

public class N12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci um numero");
        int x = in.nextInt();

        if (verificaNumeroPrimo(x)){
            System.out.println("è primo");
        } else {
            System.out.println("non è primo");
        }

    }


    public static boolean verificaNumeroPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

