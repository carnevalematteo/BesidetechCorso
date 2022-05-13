package esercizi;

import java.util.Scanner;

public class n2 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci due numeri");
        int x = in.nextInt();
        int y = in.nextInt();

        if (x != 0 && y !=0){
            System.out.println("Somma:" + (x+y));
            System.out.println("Differenza:" + (x-y));
            System.out.println("Moltiplicazione:" + (x*y));
            System.out.println("Quoziente:" + (x/y));
            System.out.println("Resto:" + (x%y));
        }


    }
}
