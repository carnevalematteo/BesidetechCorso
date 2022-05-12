package com.gaetano.arraylist;

import java.util.Arrays;
import java.util.List;

public class DueConsec {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,23,31,32,5,9,74,81,92,10);
        System.out.println(list);
        boolean verifica=false;
        for(int i=0; i< list.size()-1;i++){
            if(list.get(i)==(list.get(i+1)-1)||list.get(i)==(list.get(i+1)+1)){
                verifica= true;

            }
        }
        if (verifica){
            System.out.println("Verificato");
        }
    }
}



