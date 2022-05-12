package com.Student;

import java.util.ArrayList;
import java.util.List;

public interface UtilityStudent {

    public Student createStudent(String name,String surname, Integer id , Integer age , String city);

    public void deleteStudent(List<Student> students, Student s);
    public void updateStudent(List<Student> students, Student s);
    public Student readStudent(int id, ArrayList<Student> listStudent);




}
