package corso.ese17;

import java.util.Scanner;

public class Ese24 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Inserisci lettera minuscola");
        char corr=in.next().charAt(0);
        char prec;
        int sequenza =1;

        prec=corr;
        corr=in.next().charAt(0);
        while (corr!='.'){
            if ((corr=='a'|| corr=='e'||corr=='i' ||corr=='o'|| corr=='u')&&(prec=='a'|| prec=='e'||prec=='i' ||prec=='o'|| prec=='u')){
                sequenza++;
                corr=in.next().charAt(0);

            }

            else if((corr>'a'&& corr<='z' && corr!='e'&& corr!='i' && corr!='o'&& corr!='u')&&(prec>'a'&& prec<='z' && prec!='e'&& prec!='i' && prec!='o'&& prec!='u')){
                sequenza++;
                corr=in.next().charAt(0);

                 }
            corr=in.next().charAt(0);

            }
        sequenza++;
        System.out.println(sequenza);

    }
}
