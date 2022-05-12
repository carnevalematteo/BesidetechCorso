package com.cicli;

import java.util.Arrays;

public class SommaElementi {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2= {1,2,3,4,5,6,7,8,9,10};
        int[] risultato= sommaElem(array,array2);
        System.out.println(Arrays.toString(risultato));


    }
    public static int [] sommaElem(int [] arr , int [] arr2) {
        int[] totale = new int[10];
        for (int i = 0; i < arr.length; i++) {
            totale[i] = arr[i] + arr2[i];
        }
        return totale;
    }
}
