package corso.ese17;

import java.util.Scanner;

public class Ese17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci una sequenza ");
        int corr=0;
        while (corr<=0){
         corr=in.nextInt();
        }
        int prec;
        boolean verifica= false;


        prec=corr;
        while (corr<=0){
            corr=in.nextInt();
        }
        while (corr!=0){


            if(numeroPari(corr)&&numeroPari(prec)){
                verifica=true;
            }
            if(isMultiplo(corr,prec)){
                verifica=true;
            }
            prec=corr;
            while (corr<=0){
                corr=in.nextInt();
            }
        }
        String risultato = verifica ? "SI": "NO";
        System.out.println(risultato);
    }

    public static boolean numeroPari(int x){
        return x%2==0;
    }
    public static boolean isMultiplo(int x , int y){
        return ((x+y)%x==0 || (x+y)%y==0);
    }
}
