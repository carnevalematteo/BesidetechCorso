package com.EserciziMisti.Es_18;

import java.util.Scanner;

public class MainEs_18New {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char temp = 0;
        System.out.println("Assegna un carattere ad 'a':");
        char a = in.next().charAt(0);
        int count = 0;

        while(!(temp == 'o' && a == 'k')){
            if(!(temp == 0)){
                count++;
            }
            temp = a;
            a = in.next().charAt(0);
        }

        System.out.println(count);
    }
}
