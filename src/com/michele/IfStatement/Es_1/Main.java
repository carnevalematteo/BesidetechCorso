package com.IfStatement.Es_1;

// && and
// || or

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        Utilities metodi = new Utilities();
        metodi.setCanDrive1(persona1, persona2);

        persona1.setName("Giuseppe");
        persona1.setLastName("Rossi");
        persona1.setAge(17);

        persona2.setName("Giacomo");
        persona2.setLastName("Rossi");
        persona2.setAge(20);

        if (persona1.getName().equalsIgnoreCase(persona2.getName())) {
            System.out.println("Persona1 e persona2 hanno lo stesso nome.");
        } else if (persona1.getLastName().equalsIgnoreCase(persona2.getLastName())) {
            System.out.println("Persona1 e persona2 hanno lo stesso cognome.");
        } else {
            System.out.println("Persona1 e persona2 hanno nome e cognome diversi.");
        }

        System.out.println(persona1);
        System.out.println(persona2);

    }
}
