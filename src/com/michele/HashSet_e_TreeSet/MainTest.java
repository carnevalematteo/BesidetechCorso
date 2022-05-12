package com.HashSet_e_TreeSet;

import java.util.HashSet;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        //SET non accetta duplicati
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Matteo");
        stringSet.add("Giovanni");
        stringSet.add("Matteo");
        System.out.println(stringSet);
    }

}
