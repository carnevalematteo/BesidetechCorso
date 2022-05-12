package com.Eccezioni.Es_1;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int num = 5;
        int[] temp = new int[10];
        int counter = 0;
        boolean isFoundAlready = false;

        int[] arrNum = {1, 4, 5, 6, 1, 4, 7, 1};

        for (int i = 0; i < arrNum.length; i++) {
            isFoundAlready = false;

            if (!(arrNum[i] == temp[0])) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] == arrNum[j] && !isFoundAlready) {
                        isFoundAlready = true;
                        counter++;
                        temp[counter] = arrNum[i];
                        System.out.println(arrNum[i]);
                    }
                }
            } else {
                break;
            }

        }
    }
}
