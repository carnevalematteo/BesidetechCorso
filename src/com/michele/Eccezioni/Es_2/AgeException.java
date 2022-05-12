package com.Eccezioni.Es_2;
// Parent: Exception
// Child: AgeException

public class AgeException extends Exception {
    //Se questa eccezione viene lanciata passeremo un messaggio.
    // Lo riceveremo in entrata nel metodo e lo passeremo
    //al super() costruttore (il costruttore classe genitore).

    //Creiamo un costruttore
    public AgeException(String message){
        super(message);
        //Il messaggio è ciò che inseriremo nel costrutto:
        //throw new AgeException("INSERISCI QUI IL MESSAGGIO");
    }
}
