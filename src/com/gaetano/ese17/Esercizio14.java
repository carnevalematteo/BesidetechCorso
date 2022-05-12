package corso.ese17;

import java.util.Scanner;

public class Esercizio14 {
    public static void main(String[] args) {
       /* Scanner in =new Scanner(System.in);
        System.out.println("Inserisci sequenza");*/

        sequenzaDivisibile();



    }
    public static boolean isDecimale(int num) {
        return (num >= 0 && num <= 9);
    }



    public static void sequenzaDivisibile(){
        Scanner in =new Scanner(System.in);
        System.out.println("Inserisci sequenza");
        int num=in.nextInt();
        int conta=0;
        boolean isNumDec = true;

        while (num !=-1) {
            if (!isDecimale(num)) {
                isNumDec=false;
            }
            conta = conta * 10 + num;
            num = in.nextInt();
        }
        if(!isNumDec){
            System.out.println("ERRORE");
        }
        else{
            System.out.println(conta);
            if(conta%3==0){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }




        }

    }



