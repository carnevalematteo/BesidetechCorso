package esercizi;

import java.util.Scanner;

public class N14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("inserisci um numero");
        int x = in.nextInt();
        System.out.println(stringaNumerica(x));

    }


    public static String stringaNumerica(int x) {
        Scanner in = new Scanner(System.in);

        int giustapporsi = 0;
        boolean isDecimale = true;
        String numeri = new String();

        while(x != -1){
            if(x>=0 && x<9){
                numeri = numeri.concat(String.valueOf(x));
                giustapporsi = Integer.parseInt(numeri);
            } else {
                isDecimale = false;
            }
            x = in.nextInt();
        }

        if(giustapporsi % 3 == 0 && isDecimale){
            return "SI";
        } else if (!(giustapporsi % 3 == 0) && isDecimale) {
            return "no";
        }
        return "ERRORE";
    }


}
