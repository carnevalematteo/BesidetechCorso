package com.gaetano.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> listStudents =new ArrayList<>();
        Student stud =new Student();
        UtilityOrderStudent uos = new UtilityOrderStudent();

        Student stud1 = new Student("Mario","Rossi",567,27,"Roma");
        Student stud2 = new Student("Luca","Bianchi",345,23,"Milano");
        Student stud3 = new Student("Giovanni","Verdi",215,25,"Napoli");

        //stud.createStudent(listStudents,stud1);
       // stud2.createStudent(listStudents,stud1);

        listStudents.add(stud1);
        listStudents.add(stud2);
        listStudents.add(stud3);
        listStudents.add(stud.createStudent("Ettore","Cammarata", 322,29,"Palmi"));



        Collections.sort(listStudents,uos.compareById);
        for (Student s: listStudents) {
            System.out.println(s);
        }

       // System.out.println(listStudents);
    }
}