package com.HashSet_e_TreeSet.Es_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainEs_1 {
    public static void main(String[] args) {
        Student student1 = new Student(1344,"Matteo", "Rossi", 34);
        Student student2 = new Student(5686,"Matteo", "Rossi", 25);

        SetUtility methods = new SetUtility();
        Set<Student> studentsList = new HashSet<>();

        studentsList.add(student1);
        studentsList.add(student2);

        Iterator<Student> it = studentsList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
