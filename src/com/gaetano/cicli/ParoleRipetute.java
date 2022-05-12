package com.gaetano.cicli;

import java.util.Arrays;

public class ParoleRipetute {
    public static void main(String[] args) {

             String[] lista={"cane", "ttt", "topo", "gallo", "gatto", "gatto", "mucca", "asino", "cane", "cavallo"};
            int count = 0;
            String[] doppioni = new String[10];
            for (int i = 0; i < lista.length; i++) {
                boolean contatore = false;
                for (int j = i + 1; j < lista.length; j++) {
                    if (lista[i].equals(lista[j])) {
                        doppioni[count] = lista[i];
                        contatore = true;

                    }
                }
                if (contatore) {
                    count++;
                }
            }
            String[] nuovo = new String[count];
            for (int i = 0; i < count; i++) {
                nuovo[i] = doppioni[i];
            }
            System.out.println(Arrays.toString(nuovo));

        /* catch (EmptyException exc) {
             throw new EmptyException(Exception );
        }*/

    }
}