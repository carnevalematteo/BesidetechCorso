package esArrList;

import java.util.ArrayList;

public class StudenteEs1 implements InterfEs1, Comparable<StudenteEs1>{

    private Integer id;
    private String name;
    private String surname;
    private Integer eta;

    public StudenteEs1() {
    }


    public StudenteEs1(int id, String name, String surname, int eta) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.eta = eta;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "StudenteEs1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", eta=" + eta +
                '}';
    }

    @Override
    public int compareTo(StudenteEs1 o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public void addstudent (StudenteEs1 student, ArrayList<StudenteEs1> listaStudenti) {

    }

    @Override
    public void deleteStudent(int id, ArrayList<StudenteEs1> listaStudenti) {
        for (StudenteEs1 s: listaStudenti) {
            if(id == s.getId()){
                listaStudenti.remove(s);
                break;
            }
        }
    }

    @Override
    public void editStudent(StudenteEs1 student, ArrayList<StudenteEs1> listaStudenti) {
        for (StudenteEs1 s: listaStudenti) {
            if(s.getId() == student.getId()){
                s.setEta(student.getEta());
                s.setName(student.getName());
                s.setSurname(student.getSurname());
            }
        }
    }

    @Override
    public StudenteEs1 searchStudent(int id, ArrayList<StudenteEs1> listaStudenti) {
        StudenteEs1 foundstudent = null;
        for (StudenteEs1 s: listaStudenti) {
            if(id == s.getId())
                foundstudent = s;
        } return foundstudent;
    }

}
