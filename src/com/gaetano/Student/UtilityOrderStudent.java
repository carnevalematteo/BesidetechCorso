package com.Student;

import java.util.Comparator;

public class UtilityOrderStudent {
    Comparator<Student> compareById = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getId().compareTo(o2.getId());
        }
    };

    Comparator<Student> compareByAge = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    };

}