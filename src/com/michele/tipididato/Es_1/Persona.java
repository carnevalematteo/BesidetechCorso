package com.tipididato.Es_1;

// Classe
// Costruttore
// Getters e Setters
// Metodo toString per "stampare"


//Classe
public class Persona {

    private String name;
    private String lastName;

    //Costruttore metodo 1
  /*
  public Persona(String nameP, String lastNameP){
        this.name = nameP;
        this.lastName = lastNameP;
    }
   */

    //Costruttore metodo 2
    public Persona() {
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    //Setters
    public void setName(String nameNew){
        this.name = nameNew;
    }

    public void setLastName(String lastNameNew){
        this.lastName = lastNameNew;
    }

    @Override
    public String toString() {
        return name + "\n" + lastName + "\n" + "----------";
    }

}
