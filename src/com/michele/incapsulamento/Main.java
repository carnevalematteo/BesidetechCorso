package com.incapsulamento;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona("Giuseppe", "Brio");
        System.out.println(persona.getName());
        System.out.println(persona.getLastName());

        persona2.setName("Edoardo");
        System.out.println(persona2.getName());
    }

}
