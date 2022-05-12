package com.List.Es_2;

//Scrivere un programma DueConsecutivi che prevede un array di 10 numeri interi contenente valori a piacere
// (senza bisogno di chiederli all'utente) e stampa verifica se ci sono due numeri consecutivi

import java.util.ArrayList;
import java.util.List;

public class MainEs_2 {

    public static void main(String[] args) {
        List<Integer> sequenzaNum = new ArrayList<>();
        sequenzaNum.add(1);
        sequenzaNum.add(7);
        sequenzaNum.add(8);
        sequenzaNum.add(3);
        sequenzaNum.add(5);
        sequenzaNum.add(1);
        sequenzaNum.add(2);
        sequenzaNum.add(1);
        sequenzaNum.add(34);

        String result = checkOperazione(sequenzaNum) ? "VERIFICA" : "NON VERIFICATO";
        System.out.println(result);

    }

    public static boolean checkOperazione(List<Integer> sequenzaNum) {
        for (int i = 0, y = 1; y < sequenzaNum.size(); i++, y++) {
            if (sequenzaNum.get(y) == (sequenzaNum.get(i) + 1)) {
                return true;
            }
        }
        return false;
    }

}
