package com.List.Es_5;

import java.util.Collections;
import java.util.List;

public class Student implements UtilityMethods, Comparable<Student> {
    //Utilizzare la reference durante dichiarazione

    private Integer id;
    private String name;
    private String lastName;
    private Integer age;


    public Student() {
    }

    public Student(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public void addStudent(List<Student> students, Student a) {
        students.add(a);
    }

    @Override
    public void deleteStudent(List<Student> students, Student a) {
        students.remove(String.valueOf(a));
    }

    @Override
    public void editStudent(List<Student> students, Student a) {
        //passare come parametri un oggetto student

        for (Student stud : students) {
            if (stud.getId().equals(a.getId())) {
                stud.setName(a.getName());
                stud.setLastName(a.getLastName());
                stud.setAge(a.getAge());
            }
        }
    }

    @Override
    public void getStudent(List<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(students.get(i));
            }
        }
    }

    //Metodo
    @Override
    public void sortByAge(List<Student> students) {
        Collections.sort(students, Student::compareTo);
    }

    //Senza costruire una classe dedicata
    @Override
    public int compareTo(Student o) {
        if (this.getAge().equals(o.getAge())) {
            return this.getId().compareTo(o.getId());
        }
        return this.getAge().compareTo(o.getAge());
    }
}
