package com.Classi_Astratte.Es_1;

public class Rettangolo extends Figura2D {
    //Con l'override possono aggiungere un blocco
    // di implementazione
    @Override
    public void calcolaArea(double base, double altezza) {
        System.out.println("L'area del rettangolo è pari a " + base*altezza);
    }



}
