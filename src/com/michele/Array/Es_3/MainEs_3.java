package com.Array.Es_3;

/*
Dato un array di 10 numeri interi contenente valori a piacere ne stampa gli elementi secondo il
seguente ordine: il primo, l'ultimo, il secondo, il penultimo, ecc.

1) Scrivere un metodo che faccia la somma di tutti gli elementi di un array.
2) Scrivere un metodo che dato in input un array int ne cerchi il minimo.
*/

public class MainEs_3 {
    public static void main(String[] args) {
        // Non uso metodi con "static", quindi creo istanza:
        UtilityMethods metodi = new UtilityMethods();

        int[] arrNum = {3, 1, 4, 7, 9, 8, 5, 6, 2, 10};

        metodi.valoriAlternati(arrNum);
        System.out.println("La somma degli elementi è pari a: " + metodi.somma(arrNum));
        System.out.println("Il valore minimo è: " + metodi.valoreMinimo(arrNum));
        System.out.println("Il valore massimo è: " + metodi.valoreMassimo(arrNum));
    }
}

