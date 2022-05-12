package com.polimorfismo.Es_1;

public class Persona {
   private String name;
   private String lastName;

   public Persona(String nameP, String lastNameP){
       this.name = nameP;
       this.lastName = lastNameP;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
       return name + "\n" + lastName;
    }
}
