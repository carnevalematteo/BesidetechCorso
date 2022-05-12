package com.gaetano.eredincap;

public abstract class Utility {

    public abstract void stampaNome();

    public static int somma(int num1, int num2){
        return num1+num2;

    }
    public static int sottrazione(int num1, int num2){
        return num1-num2;

    }
    public static int moltiplicazione(int num1, int num2){
        return num1*num2;

    }
    public static int divisioneIntera (int num1,int num2){
        return num1/num2;
    }
    public static float divisione (float num1 , float num2){
        return num1/num2;
    }




    public static void confrontaNomi(String alunno1, String alunno2) {

        if (alunno1 != null && alunno2 != null) {


            if (alunno1.equals(alunno2)) {
                System.out.println("Hanno lo stesso nome");
            } else {
                System.out.println("Non hanno lo steso nome");
            }


        } else {
            System.out.println("Nono posso effettuare il controllo perchè uno dei dati risulta essere nullo");
        }
    }

    public static void confrontaEta(Studente alunno1, Studente al2) {
        if (!(alunno1.getAge() <= 0) && !(al2.getAge() <= 0)) {
            if (alunno1.getAge() == al2.getAge()) {
                System.out.println("Hanno la stessa età");
            } else {
                System.out.println("Non hanno la stessà età");
            }

        } else {
            System.out.println("Valore età errato");
        }
    }

    public static void maggioreEtà(int al1) {
        if (!(al1 <= 0)) {
            if (al1 < 18) {
                //return al1;
                System.out.println("Studente minorenne");
            } else {
                System.out.println("Studente maggiorenne");
            }
        } else {
            System.out.println("Valore età errato");
        }

    }


    public static int moltiplicaEta(int al1, int al2) {
        //calcolo = new Operazioni(); oppure  se fosse stato non statico avrei dovuto istanziare
        return moltiplicazione(al1, al2);


    }

    public static int divisioneEta(int al1, int al2){
        return divisioneIntera(al1,al2);

       // return Operazioni.divisioneIntera(al1,al2);

    }


}









/*
        String y="ciao";
        String z="ciao";
        String ab = (y.equals(z)) ? "giusto" : "sbagliato";


        String x = (4==5) ? "uguale" : "diverso";  //x sarà uguale a "diverso" in questo caso
        int a = 6;
        int b = 4;
        int c = (a==b) ? 6 : 7;   //se la condizione è vera c è uguale a 6, altrimenti uguale a 7 */


