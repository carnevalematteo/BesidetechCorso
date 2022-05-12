package com.EserciziMisti.Es_22;

import java.util.Scanner;

public class MainEs_22 {
    static boolean contieneLettera = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una lettera: ");
        char lettera = in.next().charAt(0);


        while (!(lettera == '.')) {
            checkLettera(lettera);
            lettera = in.next().charAt(0);
        }

        String result = contieneLettera ? "SI" : "NO";
        System.out.println(result);

    }

    public static boolean checkLettera(char aP) {

        if ((aP >= 'a' && aP <= 'z') || (aP >= 'A' && aP <= 'Z')) {
            contieneLettera = true;
            return contieneLettera;
        }
        return contieneLettera;
    }
}
