package esercizi;

import java.util.Scanner;

public class N10 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci um numero");
        int x = in.nextInt();
        int y = 0;
        int z = x;

        while(x!=0) {
            int resto = x % 10;
            y = (y * 10) + resto;
            x = x / 10;
        }

        System.out.println(z-y);


    }
}
