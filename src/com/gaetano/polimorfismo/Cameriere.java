package com.gaetano.polimorfismo;

public class Cameriere implements Personale {


    @Override
    public void ruolo() {
        System.out.println("Lavora in sala");
    }

    @Override
    public void anniServizio() {
        System.out.println("Il cameriere lavora in questo ristorante da 3 anni");
    }

    @Override
    public int retribuzione() {
        return 1500;
    }

    @Override
    public void retribuzione2() {
        System.out.println("Guadagna 1500£");
    }

    @Override
    public void prova() {

    }
}
