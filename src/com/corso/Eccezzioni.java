package com.corso;

public class Eccezzioni {

    public static void main(String[] args)  {

        //PROVA A FARE QUESTO
        try {

            int[] numeri = new int[1];
            numeri[0] = 10;
            numeri[1] = 20;
        }
        //ALTRIMENTI FAI QUESTO
        catch (Exception e){

            System.out.println("si è verificato un errore in fase di inizializzazione--->"+e.getMessage());

            int[] numeri = new int[1];
            numeri[0] = 10;

        }


        String [] parole ={"ciao","ciaoo"};

        UtilityMethods utilityMethods = new UtilityMethods();


       try {

           utilityMethods.dammiUnNumeroCheNonSia0(0);

       } catch (ConversioneNumeroException e) {

           System.out.println("qualcosa è andato storto");

       }
    }
}
