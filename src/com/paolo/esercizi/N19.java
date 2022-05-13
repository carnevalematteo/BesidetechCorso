package esercizi;

import java.util.Scanner;

public class N19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        boolean verifica = false;

        while(x!='*'){
            if(veirificaCarattere(x)){
                verifica = true;
            }
        x = in.next().charAt(0);
        }
        String condizione = verifica ? "Almeno una" : "nessuna";
        System.out.println(condizione);
    }
    public static boolean veirificaCarattere (char x){
        return x >= '0' && x <= '9';
    }
}
