package com.Array;

public class Utente {
    private String nome;
    private String cognome;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }


    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
