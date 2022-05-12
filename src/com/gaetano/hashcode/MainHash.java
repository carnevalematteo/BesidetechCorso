package com.hashcode;

import com.Student.Student;

import java.util.HashSet;
import java.util.Set;

public class MainHash {
    public static void main(String[] args) {
        //Student stud =new Student();
        SetUtility util = new SetUtility();
        Set<String> example = new HashSet<>();
        Set<String> example2=new HashSet<>();

        example.add("Gaetano");
        example.add("Marco");

        Student stud1 = new Student("Mario","Rossi",567,27,"Roma");
        Student stud2 = new Student("Luca","Bianchi",345,23,"Milano");
        Student stud3 = new Student("Giovanni","Verdi",345,25,"Napoli");

        System.out.println(example);
        System.out.println(util.checkIfSetIsEmpty(example));
        System.out.println(util.checkIfSetIsEmpty(example2));
        System.out.println(stud1.hashCode()==stud2.hashCode());
        System.out.println(stud2.getId().hashCode()==stud3.getId().hashCode());


        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode());
    }
}
