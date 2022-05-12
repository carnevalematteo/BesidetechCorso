package com.ereditarietà.Esercizio_ered2;

public class Studente extends Persona {
    public Studente(){};

    void greetings(){
        System.out.println("Hello I am " + name + " " + lastName + " and I am " + age + " years old. I got " + cvPoints + " points.");
    }

}
