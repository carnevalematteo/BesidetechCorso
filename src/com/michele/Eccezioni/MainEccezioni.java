package com.Eccezioni;

//Gestire le eccezioni
// Sintassi

import java.util.InputMismatchException;
import java.util.Scanner;

/*
        try {

            porzione di codice che potrebbe dare dei problemi

        } catch (Exception1 e) {

            gestione dell’eventuale problema nato nel blocco try
            Il blocco catch potrebbe anche essere vuoto, ma è necessario sia presente.

            La catch è in grado di gestire solo il tipo di eccezione per la quale è definita.
            (ovvero quella del tipo specificato tra parentesi)

        } catch (Exception2 e) {

             gestione dell’eventuale problema nato nel blocco try

        } finally {

             codice da eseguire sempre
        }
*/
// Esempio con ArithmeticException
public class MainEccezioni {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //La scelta dell'ordine delle CATCH deve essere fatta in base alla genericità, rispettando
        // l'organizzazione gerarchica. Da un punto di vista implementativo questo si traduce nel
        // posizionare i vari CATCH in ordine crescente di genericità.

        try {
            System.out.println("Inserisci un numero intero:");
            int a = in.nextInt();
            System.out.println("Inserisci un numero intero:");
            int b = in.nextInt();
            int result = a / b;
            System.out.println("Risultato: " + result);
        } catch (ArithmeticException exception) { //Eccezione specifica 1
            System.out.println("Non puoi dividere per zero");
            System.out.println("ArithmeticException");
        } catch (InputMismatchException exception) { //Eccezione specifica 2
            System.out.println("Non puoi dividere un numero per una stringa");
        } catch (Exception exception) { //Aggiungo errore generico
            System.out.println("C'è stato un problema");
        } finally { //Blocco di codice che viene sempre eseguito alla fine
            System.out.println("Arrivato alla fine, eseguito comunque");
        }

        //THROWS
        Studente studente1 = new Studente("Luca","Rossi",25);
        Scanner in2 = new Scanner(System.in);

        try {
            //Riassegno da input l'età a studente2;
            System.out.println("Inserisci età studente: ");
            int etaIn = in2.nextInt();
            studente1.setEta(etaIn);
            String result = studente1.beviAlcol(studente1.getEta()) ? "BEVI DRINK" : "NON BEVI";
            System.out.println(result);
        } catch(Exception exception){
            System.out.println("ERRORE");
        } finally {
            in.close(); //Chiudo lo scanner
            System.out.println("Fine");
        }
    }
}
