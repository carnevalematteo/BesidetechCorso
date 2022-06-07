package com.corso.pattern.Strutturali.decorator;

public class TestDecorate {
    public static void main(String[] args) {
        Persona matteo = new ScarpeDecorator(new PersonaImpl());
        System.out.println(matteo.vestila());
    }




}
