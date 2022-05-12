package com.polimorfismo;

public class Gatto implements Animali {
    @Override
    public void verso() {
        System.out.println("Miagola");
    }

    @Override
    public int numeroZampe() {
        return 4;
    }
}
