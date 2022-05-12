package com.gaetano.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EsempioArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("john");
        list1.add("ettore");

        boolean check = list1.contains("john");
        System.out.println(check);

        list1.size();  //dimensione elementi
        list1.clear(); //svuota elementi
        Collections.sort(list1);  //verifica prima tipo di dato,stringa in questo cas
        System.out.println(list1.toString());               //ordine alfabetico
        Collections.sort(list1, Collections.reverseOrder());


        // List<String>result=removeItems(list1);

    }

    public static List<String> removeItems(List<String> names) {

        List<String> result = new ArrayList();

        for (String name : names) {
            if (name.equals("matteo")) {
                result.add(name);
            }
        }
        // System.out.println(names);
        return result;
    }
}
