package com.corso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("gaetano");
        list1.add("ettore");
        list1.add("matteo");
        list1.add("paolo");
        list1.add("ettore");
        list1.add("vittorio");
        list1.add("mike");
        list1.add("gaetano");
        list1.add("ettore");
        list1.add("mike");
        list1.add("vittorio");
        list1.add("matteo");
        list1.add("gaetano");
        list1.add("matteo");
        list1.add("mike");
        list1.add("gaetano");
        list1.add("matteo");
        list1.add("paolo");
        list1.add("gaetano");
        list1.add("mike");


        Map<String, Integer>  result = getAverage(list1);

        System.out.println(result);
    }


    public static Map<String, Integer> getAverage(List<String> list1) {
        Map<String, Integer> result = new HashMap<>();

        for (String s : list1) {

            if (result.containsKey(s)) {
                int currentValue = result.get(s);
                result.put(s, currentValue + 1);
            } else {

                result.put(s, 1);
            }

        }
        return result;
    }
}
