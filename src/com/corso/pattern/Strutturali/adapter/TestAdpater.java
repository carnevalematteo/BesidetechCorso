package com.corso.pattern.Strutturali.adapter;

public class TestAdpater {
    public static void main(String[] args) {

        Move cars1 = new Ferrari();
        System.out.println(cars1.getSpeed()+"miglia orarie");

        MoveAdapter cars1Con = new MoverAdapterImpl(cars1);
        System.out.println(cars1Con.getspeed()+"km orari");

    }
}
