package com.gaetano.hashcode;



import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainHash {
    public static void main(String[] args) {
        //Student stud =new Student();
        SetUtility util = new SetUtility();
        Set<String> example = new HashSet<>();
        Set<String> example2=new HashSet<>();

        example.add("Gaetano");
        example.add("Marco");


        Student stud1 = new Student("Mario","Rossi",564,27,"Roma");
        Student stud2 = new Student("Giovanni","Bianchi",765,23,"Milano");
        Student stud3 = new Student("Giovanni","Verdi",346,25,"Napoli");
        Student stud4= null;



        Set<Student> listStudent = new HashSet<>();
        listStudent.add(stud1);
        listStudent.add(stud2);
        listStudent.add(stud3);
        listStudent.add(stud4);

        Set<Student> listStudent2=new TreeSet<>();
        listStudent2.add(stud1);
        listStudent2.add(stud2);
        listStudent2.add(stud3);
        listStudent2.add(stud4);

        System.out.println(listStudent.toString());
      System.out.println(listStudent2.toString());



/*
        System.out.println(example);
        System.out.println(util.checkIfSetIsEmpty(example));
        System.out.println(util.checkIfSetIsEmpty(example2));
        System.out.println(stud1.hashCode()==stud2.hashCode());
        System.out.println(stud2.getId().hashCode()==stud3.getId().hashCode());



        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode()); */
    }
}
