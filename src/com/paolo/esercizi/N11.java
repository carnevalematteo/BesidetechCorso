package esercizi;

import java.util.Scanner;

public class N11 {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci um numero");
        int x = in.nextInt();



    }

    public static boolean verificaPresenzaZeri(int x){
        while(x!=0) {
            int resto = x % 10;
            if(resto == 0){
                return true;
            }
            x = x / 10;
        }
        return false;
    }




}
