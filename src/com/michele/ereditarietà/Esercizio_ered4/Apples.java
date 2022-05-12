package com.ereditarietà.Esercizio_ered4;

public class Apples {
    public static void main(String[] args) {
        //Ogni volta che dobbiamo usare un metodo di un'altra classe
        // dobbiamo creare un oggetto della classe contente l'oggetto.

        Tuna tunaObject = new Tuna();
        //Entriamo nell'oggetto creato e scegliamo il metodo.
        tunaObject.simpleMessage();

    }
}
