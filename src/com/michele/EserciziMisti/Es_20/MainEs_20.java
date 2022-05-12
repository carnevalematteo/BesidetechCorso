package com.EserciziMisti.Es_20;

import java.util.Scanner;

public class MainEs_20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char value = in.next().charAt(0);
        boolean sonda = true;

        while(!(value=='.')){
            if(!(contains(value))){
                sonda = false;
            }
            value = in.next().charAt(0);
        }

        String result = sonda ? "SI" : "NO";
        System.out.println(result);
    }

    public static boolean contains(char x){
        return x>='a' && x<='z' || x>= 'A'&& x<='Z';
    }
}
