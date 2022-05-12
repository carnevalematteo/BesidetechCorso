package com.EserciziMisti.PotenzeDi2;

public class MainEs {
    public static void main(String[] args) {
        int x = 1024;
        System.out.println(isPotenza(x));
    }

    private static boolean isPotenza(int x) {
        if (x == 2) {
            return true;
        }
        if (x % 2 == 1) {
            return false;
        }
        return isPotenza(x / 2);
    }

}
