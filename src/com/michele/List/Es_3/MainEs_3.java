package com.List.Es_3;

//Scrivere un metodo che dato in input un ArrayString <Integer> ne cerchi il minimo

import java.util.ArrayList;
import java.util.List;

public class MainEs_3 {
    public static void main(String[] args) {
        List<Integer> sequenzaNum = new ArrayList<>();
        sequenzaNum.add(1);
        sequenzaNum.add(7);
        sequenzaNum.add(8);
        sequenzaNum.add(3);
        sequenzaNum.add(5);
        sequenzaNum.add(1);
        sequenzaNum.add(2);
        sequenzaNum.add(-10);
        sequenzaNum.add(34);

        int result = valoreMinimo(sequenzaNum);
        System.out.println(result);

    }

    public static int valoreMinimo(List<Integer> sequenzaNum){
        int minimo = sequenzaNum.get(0);
        for(int i = 1; i < sequenzaNum.size(); i++){
            if(minimo > sequenzaNum.get(i)){
                minimo = sequenzaNum.get(i);
            }
        }
        return minimo;
    }
}
