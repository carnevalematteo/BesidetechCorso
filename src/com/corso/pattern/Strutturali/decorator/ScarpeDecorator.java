package com.corso.pattern.Strutturali.decorator;

public class ScarpeDecorator extends MatteoDecorator{

    public ScarpeDecorator(Persona persona) {
        super(persona);
    }

    public String vestila(){

        return super.vestila() + mettiLeScarpe();
    }

    public String mettiLeScarpe(){
        return " scarpe da tennis della nike";
    }
}
