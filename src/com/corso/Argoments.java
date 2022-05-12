package com.corso;

public class Argoments {

    public static void main(String[] args) {

        for(String s : args){
            System.out.println(s);

        }


        String configVar= System.getProperty("matteo");

        System.out.println(configVar);






    }
}
