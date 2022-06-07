package com.corso.pattern.Strutturali.adapter;

public class MoverAdapterImpl implements  MoveAdapter{

    private Move interfaceMove;

    public MoverAdapterImpl(Move interfaceMove) {
        this.interfaceMove = interfaceMove;
    }

    @Override
    public double getspeed() {
        return convertMhpToKmo(interfaceMove.getSpeed());
    }

    private double convertMhpToKmo(double mhp){
        return mhp * 1.60934;
    }
}
