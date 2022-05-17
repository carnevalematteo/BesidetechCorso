package com.gaetano.log;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

import static com.gaetano.log.Operazione.logg;

public class LogClass {

    public static void main(String[] args) {

        try {

            FileHandler fh = new FileHandler("src/com/gaetano/log/exec.log");
            fh.setFormatter(new SimpleFormatter());
            fh.setLevel(Level.FINE);
            logg.addHandler(fh);
            Operazione.moltiplicazione(3, 5);
            logg.info("primo metodo eseguito");
            Operazione.pow(3);
            logg.info("secondo metodo eseguito");
            logg.info("dammi mess");

        }
       catch (IOException e) {
            e.printStackTrace();
            logg.log(Level.SEVERE,"error",e.getMessage());
        }


    }
}
