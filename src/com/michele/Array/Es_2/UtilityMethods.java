package com.Array.Es_2;

public class UtilityMethods {

    //Metodo 1:
    public static void checkOperazione(int[] arrNew) {
        for (int i = 0, y = 1; y < arrNew.length; i++, y++) {
            System.out.println(arrNew[i] + " " + arrNew[y]);
            if (arrNew[y] == arrNew[i] + 1) {
                System.out.println("VERIFICA");
            }
        }

    }

    //Metodo 2:
    public static boolean checkOperazione1(int[] arrNew) {
        for (int i = 0, y = 1; y < arrNew.length; i++, y++) {
            if (arrNew[y] == arrNew[i] + 1) {
                return true;
            }
        }
        return false;
    }
}
