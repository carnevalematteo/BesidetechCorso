package com.corso;

public class UtilityMethods {

    public int[] riempiArray(int lenght){
        int[] arrayNum = new int[lenght];
        for(int i=0 ; i<arrayNum.length ;i++){
            arrayNum[i]=i+1;
        }
        return arrayNum;
    }


    public void dammiUnNumeroCheNonSia0(int numero) throws ConversioneNumeroException {

        if(numero!=0){
            System.out.println("numero");
        }
        else{

            throw new ConversioneNumeroException("errore è stato fornito un numero non abilitato");
        }
    }



}
