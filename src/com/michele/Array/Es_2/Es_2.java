package com.Array.Es_2;

/*
Scrivere un programma DueConsecutivi che prevede un array di 10 numeri interi contenente valori a piacere
 e stampa verifica se ci sono due numeri consecutivi
 */

public class Es_2 {
    public static void main(String[] args) {
        int[] arrNum = {3, 6, 4, 5, 9, 3, 1, 2, 3, 0};
        //verifica.checkOperazione(arrNum);
        String result = UtilityMethods.checkOperazione1(arrNum) ? "VERIFICATO" : "NON VERIFICATO";
        System.out.println(result);
    }
}
