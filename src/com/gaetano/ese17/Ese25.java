package corso.ese17;

import java.util.Scanner;

public class Ese25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci sequenza");
        int corr = in.nextInt();
        int prec = -1;
        int somma =0;

        while (!(prec==0 && corr==0)){
            somma+=corr;
            prec=corr;

            if(corr==0){
                System.out.println(somma);
                somma=0;
            }
            corr= in.nextInt();
        }





    }
}
