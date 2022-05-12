package com.tipididato;

public class Main {
    public static void main(String[] args) {
       TipiDiDato tipiDiDato1 = new TipiDiDato(5, 8, 2.3f, 5.5, false, "Test");
        TipiDiDato tipiDiDato2 = new TipiDiDato();
        tipiDiDato2.setAbitata(true);

        System.out.println(tipiDiDato1);
        System.out.println(tipiDiDato2);

        OperazioneJava operazione = new OperazioneJava();
       //int num1 =  operazione.somma(1, 4);
       //int num2 =  operazione.divisione(4, 2);

        //System.out.println(num1);
        //System.out.println(num2);
        System.out.println(operazione.somma(1,3));

      //  System.out.println(OperazioneJava.somma(2, 5));

    }
}
