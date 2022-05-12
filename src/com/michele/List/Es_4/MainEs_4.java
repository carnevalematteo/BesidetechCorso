package com.List.Es_4;

import java.util.ArrayList;
import java.util.List;

public class MainEs_4 {
    public static void main(String[] args) {
        List<Integer> sequenzaNum = new ArrayList<>();
        sequenzaNum.add(1);
        sequenzaNum.add(7);
        sequenzaNum.add(28);
        sequenzaNum.add(24);
        sequenzaNum.add(63);
        sequenzaNum.add(55);
        sequenzaNum.add(23);
        sequenzaNum.add(7);
        sequenzaNum.add(8);
        sequenzaNum.add(53);

        List<Integer> sequenzaNum2 = new ArrayList<>();
        sequenzaNum2.add(5);
        sequenzaNum2.add(17);
        sequenzaNum2.add(8);
        sequenzaNum2.add(4);
        sequenzaNum2.add(83);
        sequenzaNum2.add(5);
        sequenzaNum2.add(23);
        sequenzaNum2.add(47);
        sequenzaNum2.add(1);
        sequenzaNum2.add(5);

        System.out.println(operazione(sequenzaNum, sequenzaNum2));

    }

    public static List<Integer> operazione(List<Integer> sequenzaNum, List<Integer> sequenzaNum2) {
        List<Integer> sommaArrayList = new ArrayList<>();

        for (int i = 0; i < sequenzaNum.size(); i++) {
            int somma = sequenzaNum.get(i) + sequenzaNum2.get(i);
            sommaArrayList.add(somma);
            System.out.println(somma);
        }
        return sommaArrayList;
    }
}
