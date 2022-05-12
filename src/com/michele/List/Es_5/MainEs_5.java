package com.List.Es_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEs_5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        StudentAgeComparator a = new StudentAgeComparator();

        Student methods = new Student();
        Student student1 = new Student(2245, "Marco", "Verdi", 34);
        Student student2 = new Student(5746, "Luca", "Rossi", 20);
        Student student3 = new Student(2198, "Alberto", "Blu", 18);
        Student student4 = new Student(4941, "Claudia", "Rosa", 20);
        Student student5 = new Student(1001, "Ciccio", "Black", 20);

        methods.addStudent(students, student1);
        methods.addStudent(students, student2);
        methods.addStudent(students, student3);
        methods.addStudent(students, student4);
        methods.addStudent(students, student5);

        //Collections.sort(students);

        //RECUPERO studente da ID, esempio con 5746;
        //methods.getStudent(students, 5746);

        //SORT - Ordino in base all'età
        //methods.sortByAge(students);

        //EDIT
        methods.editStudent(students, new Student(2245, "Paolo", "Galli", 43));

        //Stampo l'arrayList
        for (Student s: students) {
            System.out.println(s);
        }
    }

}
