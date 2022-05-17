package com.gaetano.log;

import java.util.logging.Logger;

public class Operazione {
    final static Logger logg = Logger.getLogger(Operazione.class.getName());
    public static int moltiplicazione(int a, int b){
        logg.info("Metodo inizializzato");
        int risultato = a*b;
        logg.info("Operazione eseguita " + risultato);
        return risultato;
    }

    public static int pow(int x){
        logg.info("Inzio del metodo");
        int risultato= x*x;
        logg.warning("Operazione eseguita " + risultato);
        return risultato;

    }

}
