package com.ereditarietà.Esercizio_ered3;

public class Persona {
    String nome;
    String cognome;

    public Persona(){};

    //Getters
    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    //Setters
    public void setNome(String nomeNew){
        this.nome = nomeNew;
    }

    public void setCognome(String cognomeNew){
        this.cognome = cognomeNew;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Cognome: " + cognome;
   }

}
