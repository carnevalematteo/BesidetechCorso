package com.gaetano.map;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> integerStringMap =new HashMap<>();
        Map<Integer,String> integerStringMap2 =new TreeMap<>();

        integerStringMap.put(1,"Inter");      //null viene accettato
        integerStringMap.put(2,"Milan");
        integerStringMap.put(3,"Napoli");
        integerStringMap.put(4,"Juventus");

        integerStringMap2.put(1,"Inter");      //null viene accettato
        integerStringMap2.put(2,"Milan");
        integerStringMap2.put(3,"Napoli");
        integerStringMap2.put(4,"Juventus");

      /*  System.out.println(integerStringMap);           //{1=Inter,2=Milan,....}
        String primoInClassifica = integerStringMap.get(1);
        System.out.println(primoInClassifica);          //Inter
        System.out.println(integerStringMap.size()); */      //4
        System.out.println(integerStringMap.values());  // [Inter,Milan,Napoli,Juventus]
        System.out.println( integerStringMap.entrySet());  // {1=Inter,2=Milan,....}

      /* Collection<String> tuttiIvalori = integerStringMap.values();
        System.out.println(tuttiIvalori);


        tuttiIvalori.forEach(s -> System.out.println(s));
        for (String s: tuttiIvalori) {
            System.out.println(s);

        }

        for (Map.Entry <Integer,String> s: integerStringMap.entrySet()){
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }

        for (String s : integerStringMap.values()){
            System.out.println(s);
        }
        for (Integer s : integerStringMap.keySet()){
            System.out.println(s);
        }


    */


        System.out.println(integerStringMap.entrySet().stream());  //solo per operazioni non per stampa
        List<String> wordList =new ArrayList<>();
        wordList.add("a");
        wordList.add("b");

        for(String s: wordList){                //i due for each sono uguali
            s.concat("1");
        }

        wordList.forEach(s -> {                 //i due for each sono uguali
            s.concat("1");
        });
        wordList.stream().forEach(s -> {        //non bada all'ordine
            s.concat("1");

        });

        integerStringMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()));

    }
}
