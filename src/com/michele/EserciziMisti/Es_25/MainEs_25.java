package com.EserciziMisti.Es_25;

import java.util.Scanner;

public class MainEs_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = -1;
        int counter = 0;
        int somma = 0;

        //Non usare counter

        while (!(temp == 0 && num == 0)) {
            counter += num;
            temp = num;
            if (num == 0) {
                somma = counter;
                System.out.println(somma);
                counter = 0;
            }
            num = in.nextInt();
        }

    }
}
