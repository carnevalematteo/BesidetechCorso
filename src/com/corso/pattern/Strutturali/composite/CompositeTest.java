package com.corso.pattern.Strutturali.composite;

public class CompositeTest {
    public static void main(String[] args) {


        Struttura posta = new Poste(1, "via roma 17");
        Struttura banca = new Banca(2, "via milano 55");

        Composite composite = new Composite();
        composite.aggiungiStruttura(posta);
        composite.aggiungiStruttura(banca);
        composite.stampaTipoStruttura();
    }

}
