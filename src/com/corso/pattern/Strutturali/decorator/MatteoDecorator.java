package com.corso.pattern.Strutturali.decorator;

public abstract class MatteoDecorator implements Persona{

    private Persona persona;

    public MatteoDecorator(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String vestila() {
        return persona.vestila();
    }


}
