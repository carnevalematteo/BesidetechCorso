package com.ereditarietà;

public class Persona extends Utilities {

    private String name;
    private String surname;

    public Persona() {

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

    @Override
    public void concatenazione() {
        System.out.println("Metodo Concatenazione" + name + " " + surname);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
