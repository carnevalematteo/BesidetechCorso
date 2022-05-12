package com.EserciziMisti.Es_23;

import java.util.Scanner;

public class MainEs_23 {
    static boolean contieneVocale = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char lettera = in.next().charAt(0);

        while(!(lettera == '*')){
            checkVocale(lettera);
            lettera = in.next().charAt(0);
        }

        String result = contieneVocale ? "ALMENO 1 VOCALE" : "NESSUNA VOCALE";
        System.out.println(result);

    }
    public static boolean checkVocale(char letteraP){
        if(letteraP == 'a' || letteraP == 'e' || letteraP == 'i' || letteraP == 'o' || letteraP == 'u'){
            contieneVocale = true;
            return contieneVocale;
        }
        return contieneVocale;
    }
}
