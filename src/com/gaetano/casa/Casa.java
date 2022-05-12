package com.gaetano.casa;

public class Casa {

   private int numPiani;
   private float numFloat;
   private double numDouble;
   private long numLong;
   private boolean isVendesi;
   private String nomeVia;

    public Casa (){

    }

    public Casa(int numPiani, float numFloat, double numDouble, long numLong, boolean isVendesi, String nomeVia) {
        this.numPiani = numPiani;
        this.numFloat = numFloat;
        this.numDouble = numDouble;
        this.numLong = numLong;
        this.isVendesi = isVendesi;
        this.nomeVia = nomeVia;
    }

    public int getNumPiani(){
        return numPiani;

   }

   public void setNumPiani(int numPiani){
        this.numPiani=numPiani;
   }

    public float getNumFloat(){
        return numFloat;
    }

    public void setNumFloat(float numFloat){
        this.numFloat=numFloat;
    }

    public double getNumDouble(){
        return numDouble;
    }

    public void setNumDouble (double numDouble){
        this.numDouble=numDouble;
    }

    public long getNumLong(){
        return numLong;
    }

    public void setNumLong (long numLong){
        this.numLong=numLong;
    }

    public boolean isVendesi(){
        return isVendesi;
    }

    public void setVendesi (boolean vendesi){
        isVendesi= vendesi;
    }

    public String getNomeVia(){
        return nomeVia;
    }

    public void setNomeVia(String nomeVia){
        this.nomeVia=nomeVia;
    }

   public String toString() {
        return "Casa{" +
                "numPiani=" + numPiani +
                ", numFloat=" + numFloat +
                ", numDouble=" + numDouble +
                ", numLong=" + numLong +
                ", isVendesi=" + isVendesi +
                ", nomeVia='" + nomeVia + '\'' +
                '}';
    }
}