package com.Final_e_Static;

public class Main {
    public static void main(String[] args) {

        /*
        // final consiste nel dire che la variabile è nella sua forma finale e non può essere modificata
       final int prova = 5;
        prova = 10;
        System.out.println(prova);
        */

        //Static condivide un attributo o un metodo tra diverse istanze

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNome("Luca");
        persona1.setCognome("Rossi");
        persona2.setNome("Marco");
        persona2.setCognome("Verdi");

        System.out.println(persona1);

    }
}
