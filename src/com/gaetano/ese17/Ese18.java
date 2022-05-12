package corso.ese17;

import java.util.Scanner;

public class Ese18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci carattere");
        char corr= in.next().charAt(0);
        char prec = 0;
        int contatore=0;

        prec=corr;
        corr=in.next().charAt(0);
        while(prec!='o' && corr!='k'){
            contatore++;
            corr=in.next().charAt(0);
        }
        System.out.println(contatore);
    }
}
