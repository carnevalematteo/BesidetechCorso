package com.ereditarietà;

public class Studente extends Persona implements Anagrafica {

    private Scuola scuola;

    public Studente() {
    }

    //Getters
    public Scuola getScuola() {
        return scuola;
    }

    //Setters
    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }


}
