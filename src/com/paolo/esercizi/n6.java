package esercizi;

import java.util.Scanner;

public class n6 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("inserisci um numero");
        int x = in.nextInt();

        if (x>0){
            if (x%4==0 && !(x/100==0 && x/400==0)){
                System.out.println("bisestile");
            } else {
                System.out.println("non bisestile");
            }
        } else {
            System.out.println("numero negativo non valido");
        }
    }
}
