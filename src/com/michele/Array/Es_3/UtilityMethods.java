package com.Array.Es_3;

public class UtilityMethods {

    public void valoriAlternati(int[] arr) {
        for (int i = 0, y = arr.length - 1; i < arr.length / 2 && y > arr.length / 2; i++, y--) {
            System.out.println(arr[i]);
            System.out.println(arr[y]);
        }
    }

    public int somma(int[] arr) {
        int sommmaCalc = 0;
        for (int i : arr) {
            sommmaCalc += i;
        }
        return sommmaCalc;
    }

    public int valoreMinimo(int[] arr) {
        //Lavoro "per assurdo"
        int minimo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minimo > arr[i]) {
                minimo = arr[i];
            }
        }
        return minimo;
    }

    public int valoreMassimo(int[] arr) {
        //Lavoro "per assurdo"
        int massimo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (massimo < arr[i]) {
                massimo = arr[i];
            }
        }
        return massimo;
    }


}
