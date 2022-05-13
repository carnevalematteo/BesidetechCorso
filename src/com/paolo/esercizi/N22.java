package esercizi;

import java.util.Scanner;

public class N22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        boolean verifica = false;

        while(x!='.'){
            if(veirificaAlfabetoInglese(x)){
                verifica = true;
            }
            x = in.next().charAt(0);
        }
        String condizione = verifica ? "SI" : "NO";
        System.out.println(condizione);
    }
    public static boolean veirificaAlfabetoInglese (char x){
        return x>= 'a' && x<='z' || x>= 'A' && x<='Z';
    }
}
