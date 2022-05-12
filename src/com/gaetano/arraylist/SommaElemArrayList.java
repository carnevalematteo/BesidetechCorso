package com.arraylist;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SommaElemArrayList {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> lista2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> risultato= sommaArrayList(lista,lista2);
        System.out.println(risultato);




    }
    public static List<Integer> sommaArrayList (List<Integer> elem , List <Integer> elem2) {
        List<Integer> totale = new ArrayList<>();
        for (int i = 0; i < elem.size(); i++) {
            totale.add(i,elem.get(i) + elem2.get(i));
        }

        return totale;
    }
}
