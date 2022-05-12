package com.EserciziMisti.Es_21;

import java.util.Scanner;

public class MainEs_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char value = in.next().charAt(0);
        boolean contieneIngl = false;

        while(!(value=='.')){
            if((contains(value))){
                contieneIngl = true;
            }
            value = in.next().charAt(0);
        }

        String result = contieneIngl ? "NO" : "SI";
        System.out.println(result);
    }

    public static boolean contains(char x){
        return x>='a' && x<='z' || x>= 'A'&& x<='Z';
    }
}
