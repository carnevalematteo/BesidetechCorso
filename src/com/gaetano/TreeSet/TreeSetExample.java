package com.TreeSet;

import com.Student.Student;
import com.hashcode.SetUtility;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> stringSet =new TreeSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("E");
        stringSet.add("D");
        stringSet.add("C");
        stringSet.add("F");

        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        System.out.println("C".hashCode());
        System.out.println("D".hashCode());
        System.out.println("E".hashCode());
        System.out.println("F".hashCode());

        Student stud1 = new Student("Mario","Rossi",567,27,"Roma");
        Student stud2 = new Student("Luca","Bianchi",345,23,"Milano");
        Student stud3 = new Student("Giovanni","Verdi",215,25,"Napoli");




        for (String s: stringSet) {
            System.out.println(s);

        }


    }
}
