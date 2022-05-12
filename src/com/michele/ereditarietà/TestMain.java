package com.ereditarietà;

public class TestMain {
    public static void main(String[] args) {

        Scuola scuola1 = new Scuola();
        scuola1.setNomeScuola("Alessandro Volta");
        scuola1.setIndirizzo("Via Modena");

        Scuola scuola2 = new Scuola();
        scuola2.setNomeScuola("Alessandro Verdi");
        scuola2.setIndirizzo("Via Roma");

        Studente studente1 = new Studente();
        studente1.setScuola(scuola1);

        Docente docente1 = new Docente();
        docente1.setScuola(scuola1);

        studente1.setName("Matteo");
        studente1.setSurname("Rossi");

        docente1.setName("Giovanna");
        docente1.setSurname("Verdi");

        //Creo un oggetto x
        Persona x = new Persona();
        x.setName("Luca");
        x.setSurname("Rossi");
        // Stampa il metodo
        x.concatenazione();
        //System.out.println(x);


    }
}
