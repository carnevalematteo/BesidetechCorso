package com.Eccezioni.Es_1;

public class Utility {

    public String[] arrDoppione(String[] arr) throws EmptyArrException {
        if (arr.length == 0) {
            throw new EmptyArrException("ERRORE: ARRAY VUOTO");
        }

        String[] arrNew = new String[10];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i!=j) {
                    if(!checkDopp(arrNew, arr[i])){
                        arrNew[counter] = arr[i];
                        counter++;
                    }
                }
            }
        }
        return arrNew;
    }

    public static boolean checkDopp(String[] arrDop2, String word) {
        for (int i = 0; i < arrDop2.length; i++) {
            if(arrDop2[i]!=null){
                if (arrDop2[i].equals((word))) {
                    return true;
                }
            }
        }
        return false;
    }
}
