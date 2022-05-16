package com.gaetano.log;

import java.util.logging.Logger;

public class Operazione {
    private static final Logger logg = Logger.getLogger(Operazione.class.getName());
    public static int moltiplicazione(int a, int b){
        logg.info("Metodo inizializzato");
        int risultato = a*b;
        logg.info("Operazione eseguita" + risultato);
        return risultato;
    }

}
