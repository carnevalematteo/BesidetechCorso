package com.List;

//un insieme corrisponde a un gruppo di obj tutti distinti tra loro, esempio: (a b c d)
//In una lista possiamo avere elementi ripetuti ( a a b c c d).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        //Differenza Array vs ArrayList:

        //Array
        String[] collectionArray = new String[10];

        //ArrayList
        Collection<String> collectionList = new ArrayList<>();
        collectionList.add("A");
        collectionList.add("B");
        collectionList.add("C");

        //Questo tipo di costrutto crea una via di mezzo tra un Array e un ArrayList
        //Infatti la lunghezza è fissa
        List<String> list = Arrays.asList("john","ettore","matteo");

        //Il modo in cui implementiamo una Lista è:
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("A");
        stringList.add("C");

        String valore = stringList.get(0);

        stringList.set(0, "Add");


        //Modificare gli elementi: aggiungere
        for (String s : stringList) {
            if (s.equalsIgnoreCase("A")) {
                stringList.set(stringList.indexOf(s), "C");
            }
        }

        System.out.println(stringList.toString());
    }
}
