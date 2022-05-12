package com.List.Es_5;

import java.util.List;

public interface UtilityMethods {
    public void addStudent(List<Student> students, Student a);
    public void deleteStudent(List<Student> students, Student a);
    public void editStudent(List<Student> students, Student a);
    public void getStudent(List<Student> students, int id);
    public void sortByAge(List<Student> students);
}
