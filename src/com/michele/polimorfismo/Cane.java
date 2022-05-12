package com.polimorfismo;

public class Cane implements Animali {
    @Override
    public void verso() {
    System.out.println("Abbaia");
    }

    @Override
    public int numeroZampe() {
        return 4;
    }
}
