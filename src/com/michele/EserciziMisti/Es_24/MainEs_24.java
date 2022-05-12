package com.EserciziMisti.Es_24;

import java.util.Scanner;

public class MainEs_24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char lettera = in.next().charAt(0);
        char temp = 0;
        int counter = 1;

        while (!(lettera == '.')) {
            if ((isVocale(temp) && (isVocale(lettera)) || (!(isVocale(temp)) && !(isVocale(lettera))))) {
                counter++;
            }

            temp = lettera;
            lettera = in.next().charAt(0);
        }
        System.out.println(counter);

    }

    public static boolean isVocale(char letteraP) {
        if (letteraP == 'a' || letteraP == 'e' || letteraP == 'i' || letteraP == 'o' || letteraP == 'u') {
            return true;
        }
        return false;

    }
}
