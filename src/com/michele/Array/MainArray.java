package com.Array;

public class MainArray {
    public static void main(String[] args) {
        String bmw = "BMW";
        String audi = "AUDI";
        String fiat = "FIAT";

        Utente utente1 = new Utente("Matteo", "Carnevale");
        Utente utente2 = new Utente("Ettore", "Cammarata");
        String[] marche = {"BMW", "AUDI", "FIAT"};

        //Metodo 1:
        Utente[] utenteArr = {utente1, utente2};

        //System.out.println(utenteArr[0]);

        //Metodo 2: questo Array avrà una capienza di 10 elementi
        Utente[] utenteArray2 = new Utente[10];
        utenteArray2[0] = utente1;
        utenteArray2[1] = utente2;

        System.out.println(utenteArray2[0]);

        int size = bmw.length();
        System.out.println(size);

        String[] bmwArr = new String[size];
        bmwArr[0]=String.valueOf(bmw.charAt(0));
        bmwArr[1]= String.valueOf(bmw.charAt(1));
        bmwArr[2]= String.valueOf(bmw.charAt(2));

        System.out.println(bmwArr[0]);
        System.out.println(bmwArr[1]);
        System.out.println(bmwArr[2]);


        //array di 10 celle di tipo int
        //e tramite un cicli for che va da 1 a 10 riempiamo le posizioni degli array

    }
}
