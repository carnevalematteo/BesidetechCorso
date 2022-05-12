package com.EserciziMisti.Es_14;

import java.util.Scanner;

public class MainEs_14_new {

    static int result = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Associo un primo valore a num
        int num = in.nextInt();
        boolean isDecimale = true;

        //Primo check
        while (num != -1) {
            //Secondo check
            if (!(num >= 0 && num <= 9)) {
                isDecimale = false;
            }
            operazione(num, result);
            num = in.nextInt();
        }

    }

    public static void operazione(int numNew, int resultNew) {
        result = (resultNew * 10) + numNew;
    }

    public boolean isDivisibile(int a){
      return a%3==0;
    }
}
