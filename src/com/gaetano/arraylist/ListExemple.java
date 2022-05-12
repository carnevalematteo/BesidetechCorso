package com.gaetano.arraylist;

import java.util.*;

public class ListExemple {

    public static void main(String[] args) {

        String [] collectionArray = new String [10];
        collectionArray[0] ="ciao";


        //Collection<String> collectionList = new ArrayList<>();


        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("A");
        stringList.add("B");

        String valore =stringList.get(0);


        stringList.set(0,"Add");
        //System.out.println(stringList.toString());

        String [] insertArr = {"",""};

        List<String> list = Arrays.asList("john", "ettore","matteo");
        //list.add("ciao");
        //list.forEach(s -> System.out.println(s));



        List<String> list1 = new ArrayList<>();
        list1.add("john");
        list1.add("ettore");
        list1.add("matteo");


        boolean check =list1.contains("john");
        System.out.println(check);

        Collections.sort(list1,Collections.reverseOrder());

        System.out.println(list1.toString());

        List<Boolean> listB = new ArrayList<>();
        listB.add(true);
        listB.add(false);

        Collections.sort(listB,Collections.reverseOrder());

        System.out.println(listB.toString());


        List<String>result =removeItems(list1);
        // list.removeAll(result);
        // System.out.println(list1.toString());
    }

    public static List<String> removeItems(List<String> names){

        List<String> result = new ArrayList();

        for (String name : names) {
            if (name.equals("matteo")){
                result.add(name);
            }
        }
        // System.out.println(names);
        return result;
    }


}
