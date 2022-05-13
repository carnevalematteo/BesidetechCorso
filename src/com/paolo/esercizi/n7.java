package esercizi;

import java.util.Scanner;

public class n7 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci um numero");
        int x = in.nextInt();
        boolean ruben = false;

        while (x!=5){
            if (x%5==0 && x!=0) {
                ruben = true;
            }
            x = in.nextInt();
        }

        if (ruben) {
            System.out.println("almeno1");
        } else {
            System.out.println("nessuno");
        }



    }
}
