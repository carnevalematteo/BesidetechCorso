package com.Eccezioni.Es_3;
/*
Date due String str1 e str2, verificare se hanno la stessa lunghezza e controllare in quanti caratteri differiscono.
Alla fine calcolare la percentuale di caratteri differenti.
 */

public class MainEs_3 {
    static int result = 0;
    public static void main(String[] args) {
        String str1 = "giuseppe";
        String str2 = "matteo";
        operazione(str1, str2);
    }

    public static void operazione(String str1, String str2) {

        //CONTROLLARE SEMPRE SE SONO NULL
        if(!(str1 == null || str2 == null)){
            if (str1.length() > str2.length()) {
                result = str1.length() - str2.length();
                calcPercentuale(str1.length(), result);
            } else {
                result = str2.length() - str1.length();
                calcPercentuale(str2.length(), result);
            }
        } else {
            System.out.println("ERRORE");
        }
    }

    public static void calcPercentuale(int a, int b){
       float perc = (a*b)/100f;
       System.out.println(perc*100);
    }

}
