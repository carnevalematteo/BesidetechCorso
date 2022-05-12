package com.michele.Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        //Il metodo accetta due parametri, una lista
        //e un oggetto Comparator:

        Comparator<Laptop> comp = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop lap1, Laptop lap2) {
                if(lap1.getPrice()>lap2.getPrice()){
                    return 1;
                }
                return -1;
            }
        };

        Collections.sort(laps, comp);

        for (Laptop elem: laps) {
            System.out.println(elem);
        }
    }
}
