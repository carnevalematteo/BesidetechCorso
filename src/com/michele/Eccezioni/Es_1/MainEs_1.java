package com.Eccezioni.Es_1;

// Dato un array String (massimo 10 elementi) trovare le parole ripetute e inserirle in un nuovo array che verrà
// tornato dal metodo.
// Creiamo una nuova classe di eccezioni, dove se l'array iniziale che fornisco in input è vuoto o uguale a 0 farà
//// scattare l'eccezione.

import java.util.Arrays;

public class MainEs_1 {
    public static void main(String[] args) {

        Utility metodi = new Utility();

        String[] arr = {"rosso", "verde", "rosso", "giallo", "rosso", "blu", "rosa", "verde", "giallo", "viola"};
        String[] result = null;
        
        try {
          result = metodi.arrDoppione(arr);

        } catch (EmptyArrException exception) {
            exception.printStackTrace();
        }
        for(int i = 0; i < result.length; i++){
            if(result[i]!=null){
                System.out.println(result[i]);
            }
        }
    }


}
