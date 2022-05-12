package com.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimoArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,23,31,32,5,9,74,81,92,10);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Il minimo e' " + list.get(0));
    }

}
