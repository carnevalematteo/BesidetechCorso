package com.gaetano.cicli;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Inserisci numero mese");

        String month;
        month= in.next();


        switch (month){
        case "1":
        month= " Gennaio";
        break;
        case "2":
        month= " Febbraio";
        break;
        case "3":
        month= " Marzo";
        break;
        case "4":
        month= " Aprile";
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

