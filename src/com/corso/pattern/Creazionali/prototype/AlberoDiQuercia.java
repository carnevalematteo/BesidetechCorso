package com.corso.pattern.Creazionali.prototype;

public class AlberoDiQuercia extends Albero {


    public AlberoDiQuercia() {
        type = "AlberoDiQuercia";
    }

    @Override
    void stampa() {
        System.out.println("sono un albero di quercia");
    }
}