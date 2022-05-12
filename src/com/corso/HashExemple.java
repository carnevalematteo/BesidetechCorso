package com.corso;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExemple {

    public static void main(String[] args) {

        //i set non accettano duplicati
        Set<String> stringSet = new HashSet<>();


        //stringSet.add("matteo");
       // stringSet.add("Matteo");

        String str1="matteo";
        String str2="Matteo";
        String str3 ="Matteo";

        //System.out.println(str1.hashCode());
        //System.out.println(str2.hashCode());
        //System.out.println(str3.hashCode());


        String [] words={"ciao","ciao","cane","ciao","gatto","gatto","cane"};

        stringSet=filtraDuplicati(words);
        //stringSet.forEach(s -> System.out.println(s));

        Utente utente1= new Utente("matteo","carnevale");
        Utente utente2 = new Utente("matteo","Carnevale".toLowerCase());
        Utente utente3 = utente1;

        System.out.println(utente1.hashCode());
        System.out.println(utente2.hashCode());
        System.out.println(utente3.hashCode());

        Set<Utente> utenteSet = new HashSet<>();

        utenteSet.add(utente1);
        utenteSet.add(utente2);
        utenteSet.add(utente3);

        //utenteSet.forEach(s -> System.out.println(s.getNome()));

        Iterator<Utente> it = utenteSet.iterator();

        while(it.hasNext()){

            System.out.println(it.next());

        }





    }


    public  static  Set filtraDuplicati(String [] words){
        Set<String> stringSet = new HashSet<>();
        for(int i=0;i< words.length;i++){
            if(!stringSet.add(words[i])){
               // System.out.println("il valore è duplicato non aggiungo---->"+words[i]);
            };
        }
        return stringSet;
    }
}
