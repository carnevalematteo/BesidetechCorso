package com.tipididato.Es_1;

//Ereditarietà
// Possiamo estendere solamente a una classe
public class Studente extends Persona {

   private int voto;

    //Costruttore
    public Studente() {
    }

    public int getVoto(){
        return voto;
    }

    public void setVoto(int votoNew){
        this.voto = votoNew;
    }

    @Override
    public String toString() {
        return voto + " " + getName() + " " + getLastName();
    }
}
