package com.ereditarietà.Esercizio_ered2;

public class Main {
    public static void main(String[] args) {
            Studente studente1 = new Studente();
            Docente docente1 = new Docente();

            studente1.setName("John");
            studente1.setLastName("Hiland");
            studente1.setAge(14);
            studente1.setCvPoints(234);
            studente1.greetings();
    }
}

