package com.Array.Es_5;

import java.util.Locale;
import java.util.Scanner;

public class MainEs_5 {
    public static void main(String[] args) {
        boolean isPalindromo = true;
        Scanner in = new Scanner(System.in);
        String word = in.nextLine().toLowerCase();

        String[] arr = word.split("");
        for (int i = 0, y = arr.length - 1; i < arr.length / 2 && y > arr.length / 2; i++, y--) {
            if (!(arr[i].equals(arr[y]))) {
                isPalindromo = false;
            }
        }

        String result = isPalindromo ? "PALINDROMO" : "NO";
        System.out.println(result);
    }
}
