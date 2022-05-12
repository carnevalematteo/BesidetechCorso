package com.polimorfismo;


public interface Animali {

    public void verso();
    public int numeroZampe();
    default boolean isAnimale(){
        return true;
    };
}
