package esercizi;

import java.util.Scanner;

public class N18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char corr = in.next().charAt(0);
        char prec=0;
        int count = 0;

        prec=corr;
        corr = in.next().charAt(0);
        while (prec!='o' && corr!='k'){
            count++;
            corr = in.next().charAt(0);
        }
        System.out.println(count);

    }





}
