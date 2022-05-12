package com.incapsulamento;

public class Persona {
    //L'incapsulamento è un processo in cui nascondiamo attributi di una classe all'esterno mettendoli private.
    //Tali attributi saranno accessibili solo tramite dei metodi (Getters e Setters).
    //Attributi dichiarati con private
    // Gli attributi o variabili di istanza sono variabili dichiarate
    // in una classe.

    private String name;
    private String lastName;

    public Persona(String nameNew, String lastNameNew){
        this.name = nameNew;
        this.lastName = lastNameNew;
    }

    // Come fare a utilizzare fuori dalla classe variabili dichiarate con private? Possiamo utilizzare dei metodi;
    // Questi metodi sono i "getter and setter";
    //Accediamo a name dentro la classe e ritorniamo il risultato fuori. Il getter e il setter fa da intermediario
    // per "spostare" informazioni.

   public String getName(){
        return name;
   }

   public String getLastName(){
        return lastName;
   }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
