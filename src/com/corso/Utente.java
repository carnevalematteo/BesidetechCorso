package com.corso;

import java.util.Objects;

public class Utente implements  Comparable<Utente>{

    private String nome;

    private String cognome;


    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(nome, utente.nome) && Objects.equals(cognome, utente.cognome);
    }



    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Utente o) {
        return this.nome.compareTo(o.nome);
    }
}

