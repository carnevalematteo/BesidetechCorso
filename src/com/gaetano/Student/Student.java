package com.gaetano.Student;

import java.util.ArrayList;
import java.util.List;

public class Student implements UtilityStudent {
    private String name;
    private String surname;
    private Integer id;
    private Integer age;
    private String city;
    private Integer cf;

    public Student() {

    }

    public Student(String name, String surname, int id, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }


    @Override
    public Student createStudent(String name,String surname, Integer id , Integer age , String city) {
        return new Student(name,surname,id,age,city);
    }

    @Override
    public void deleteStudent(List<Student> listStudents, Student s) {
        for(Student st:listStudents){
            if(s.getId()==id){
                listStudents.remove(st);
                break;
            }
        }
    }

    @Override
    public void updateStudent(List<Student> listStudents, Student s) {
        for (Student st: listStudents){
            if(st.getId()== st.getId()){
                st.setAge(st.getAge());
                st.setName(st.getName());
                st.setSurname(st.getSurname());

            }
        }
    }

    @Override
    public Student readStudent(int id, ArrayList<Student> listStudent) {
        Student found = null;
        for (Student s: listStudent){
            if(id == s.getId()){
                found = s;
            }

        }
        return found;
    }

}
    /*public void sortById(List<Student> listStudents){
            Collections.sort(listStudents,new StudentIdComparator());  //Student::compareTo
    }*/


    ;
   /* @Override
    public int compareTo(Student o) {
        return this.getId()-o.getId();
    } */





