package com.tipididato;

public class TipiDiDato {
    int piano;
    long altezza;
    float mq;
    double mq2;
    boolean isAbitata;
    String indirizzo;

    public TipiDiDato() {
    }

    public TipiDiDato(int piano, long altezza, float mq, double mq2, boolean isAbitata, String indirizzo) {

        this.piano = piano;
        this.altezza = altezza;
        this.mq = mq;
        this.mq2 = mq2;
        this.isAbitata = isAbitata;
        this.indirizzo = indirizzo;

    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public long getAltezza() {
        return altezza;
    }

    public void setAltezza(long altezza) {
        this.altezza = altezza;
    }

    public float getMq() {
        return mq;
    }

    public void setMq(float mq) {
        this.mq = mq;
    }

    public double getMq2() {
        return mq2;
    }

    public void setMq2(double mq2) {
        this.mq2 = mq2;
    }

    public boolean isAbitata() {
        return isAbitata;
    }

    public void setAbitata(boolean abitata) {
        isAbitata = abitata;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    // Qui facciamo l'override del metodo toString(), di default il toString() mostra la collocazione in memoria (l'indirizzo),
    // in questo modo possiamo personalizzare ciò che vogliamo vedere come risultato.

    @Override
    public String toString() {
        return "TipiDiDato{" +
                "piano=" + piano +
                ", altezza=" + altezza +
                ", mq=" + mq +
                ", mq2=" + mq2 +
                ", isAbitata=" + isAbitata +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}