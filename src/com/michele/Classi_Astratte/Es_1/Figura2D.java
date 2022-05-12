package com.Classi_Astratte.Es_1;

public abstract class Figura2D {
    private double base;
    private double altezza;

    public Figura2D(double baseP, double altezzaP){
        this.base = baseP;
        this.altezza = altezzaP;
    }

    public Figura2D(){};

    //Costruttore per copia
   /*
    public Figura2D(Figura2D fig){
        this.base = fig.base;
        this.altezza = fig.altezza;
    }
   */

    //Metodo astratto
    public abstract void calcolaArea(double base, double altezza);

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


}
