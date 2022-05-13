package esercizi;

import java.util.Scanner;

public class N3 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int x = in.nextInt();

        if (x % 2 == 0) {
            System.out.println("PARI");
        } else {
            System.out.println("DISPARI4");
        }

    }

}
