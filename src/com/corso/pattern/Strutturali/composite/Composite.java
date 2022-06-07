package com.corso.pattern.Strutturali.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Struttura{



    private List<Struttura> figli;

    public Composite() {

        this.figli = new ArrayList<>();
    }

    @Override
    public void stampaTipoStruttura() {

        figli.forEach(struttura -> struttura.stampaTipoStruttura());

    }

    public void aggiungiStruttura(Struttura struttura){
        figli.add(struttura);
    }

    public void rimuoviStruttura(Struttura struttura){
        figli.remove(struttura);
    }
}
