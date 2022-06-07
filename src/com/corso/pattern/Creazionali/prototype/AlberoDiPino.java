package com.corso.pattern.Creazionali.prototype;

public class AlberoDiPino extends Albero{



    public AlberoDiPino() {
        type="AlberoDiPino";
    }

    @Override
    void stampa() {
        System.out.println("sono un albero di pino");
    }
}
