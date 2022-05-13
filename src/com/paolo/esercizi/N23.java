package esercizi;

import java.util.Scanner;

public class N23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        boolean verifica = false;

        while(x!='.'){
            if(veirificaVocale(x)){
                verifica = true;
            }
            x = in.next().charAt(0);
        }
        String condizione = verifica ? "Almeno1" : "Nessuno";
        System.out.println(condizione);
    }
    public static boolean veirificaVocale (char x){
        return x=='a' || x=='e' || x=='i'|| x=='o' || x=='u';
    }
}
