package com.EserciziMisti.Es_14;

import java.util.Scanner;

public class MainEs_14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Associo un primo valore a num
        int num = in.nextInt();
        int result = 0;
        boolean isDecimale = true;

        //Primo check
        while (num != -1) {
            //Secondo check
            if (!(num >= 0 && num <= 9)) {
                isDecimale = false;
            }
           // operazione(num);
            result = (result * 10) + num;
            num = in.nextInt();
        }

        if(isDecimale) {
            if(result%3==0){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("ERRORE");
        }
    }

}
