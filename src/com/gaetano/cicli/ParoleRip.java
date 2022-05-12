package com.gaetano.cicli;

public class ParoleRip {

    public String[] paroleRipetute(String lista[]) throws EmptyException {
        if(lista.length==0){
            throw new EmptyException("Errore Stringa nulla");
        }
        int count = 0;

        String[] doppioni = new String[10];
        for(int i = 0; i < lista.length; i++) {
            for (int j =0; j < lista.length; j++) {
                if (lista[i].equals(lista[j])&& i!=j) {
                    if (!(checkDopp(doppioni,lista[i],count))){
                        doppioni[count] = lista[i];
                        count++;
                    }
                }
            }
        }
        String[] nuovo = new String[count];
        for(int i = 0; i < count; i++) {
            nuovo[i] = doppioni[i];
        }
        return nuovo;
    }

    public static boolean checkDopp(String[] arr , String a, int cont){
        for (int i=0; i< cont; i++){
            if(arr[i].equals(a)){
                return true;
            }
        }
        return false;


    }
}