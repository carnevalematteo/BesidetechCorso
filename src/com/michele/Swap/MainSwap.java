package com.Swap;

public class MainSwap {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("x: " + x + "\n" + "y: " + y);
        swap(x, y);
        System.out.println("x: " + x + "\n" + "y: " + y);
    }


    public static void swap(int x, int y){
        int z = x;

        x = y;
        y = z;
    }
}
