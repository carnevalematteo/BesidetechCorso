package com.ereditarietà;

public class Docente extends Persona implements Anagrafica {

    private Scuola scuola;

   public Docente() {
    }


    //Getters
    public Scuola getScuola() {
        return scuola;
    }

    //Setters
    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "scuola=" + scuola +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }
}
