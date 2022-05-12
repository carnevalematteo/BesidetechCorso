package com.cicli;

public class DifferenzaCaratt {
    public static void main(String[] args) {
        System.out.println(diffCaratt("Addizione","Sottrazione"));
        System.out.println(percCaratt("Sottrazione", "Addizione") + " %");

    }
    public static int diffCaratt(String a , String b){
        int lunghezza = a.length();
        int lunghezza2= b.length();
        int differenza= Math.abs(lunghezza - lunghezza2);
        return differenza;
    }
    public static double percCaratt(String a, String b){
        double lunghezza = a.length();
        double lunghezza2= b.length();

        double percentuale= Math.abs(100 -(lunghezza/lunghezza2)*100);
        return percentuale;
    }
}

