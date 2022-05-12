package com.IfStatement.Es_1;

public class Utilities {
    public void setCanDrive1(Persona persona1, Persona persona2) {

        if (persona1.getAge() >= 18) {
            persona1.setCanDrive(true);
        } else {
            persona1.setCanDrive(false);
        }
        if (persona2.getAge() >= 18) {
            persona2.setCanDrive(true);
        } else {
            persona2.setCanDrive(false);
        }
    }
}
