package com.gaetano.cicli;

public class SwitchNum {
    public static void main(String[] args) {
        String month= "Aprile";


        switch (month){
            case "Gennaio":
                month= " 1";
                break;
            case "Febbraio":
                month= " 2";
                break;
            case "Marzo":
                month= " 3";
                break;
            case "Aprile":
                month= " 4";
                break;
            case "5":
                month= "Maggio";
                break;
            case "6":
                month= " Giugno";
                break;
            case "7":
                month= " Luglio";
                break;
            case "8":
                month= " agosto";
                break;
            case "9":
                month= " Settembre";
                break;
            case "10":
                month= " Ottobre";
                break;
            case "11":
                month= " Novembre";

                break;
            case "12":
                month= " Dicembre";
            default:
                month="Errore inserimento";
        }
        System.out.println(month);
    }
}


