package com.corso;

import java.util.Arrays;

public class FilterWTest {

    public static void main(String[] args) {

        FilterW filterW = new FilterW();

        String [] words = {"ciao","gatto","ciao","gatto","cane","pollo","ciao","ciao"};

        String []result= filterW.filterWord(words);

        System.out.println(Arrays.toString(result));
    }
}
