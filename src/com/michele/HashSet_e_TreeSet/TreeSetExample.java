package com.HashSet_e_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        //L'argomento va dentro <Argomento>, argomento opzionale all'interno di <> (dopo new TreeSet), meglio non metterlo
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("E");
        stringSet.add("D");
        stringSet.add("C");
        stringSet.add("F");

        //il TreeSet si basa su equals non tramite hashCode
        //Il TreeSet ordina i dati all'interno della collezione (tramite hashCode)

       // Set<String> stringSet = new TreeSet<>();


        for (String s : stringSet) {
            System.out.println(s);
        }
    }

}
