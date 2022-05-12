package com.Final_e_Static;

public class Persona {
    String nome;
    String cognome;
    static int numeroPersone;

  /*  public Persona(String nomeP, String cognomeP) {
        this.nome = nomeP;
        this.cognome = cognomeP;
        numeroPersone++;
        System.out.println(numeroPersone);

    }*/

    public static void mostraNumPersona(){
        int x = numeroPersone++;
        System.out.println("Il numero di persona create è: " + x);
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

    public static int getNumeroPersone() {
        return numeroPersone;
    }

    public static void setNumeroPersone(int numeroPersone) {
        Persona.numeroPersone = numeroPersone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "cognome: " + cognome + "\n" + numeroPersone++;
    }
}
