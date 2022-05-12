package com.IfStatement.Es_1;

public class Persona {
    private String name;
    private String lastName;
    private int age;
    private boolean canDrive;

    public Persona() {
    }

    ;

    //Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean getCanDrive() {
        return canDrive;
    }

    //Setters
    public void setName(String nameNew) {
        this.name = nameNew;
    }

    public void setLastName(String lastNameNew) {
        this.lastName = lastNameNew;
    }

    public void setAge(int ageNew) {
        this.age = ageNew;
    }

    public void setCanDrive(boolean canDriveNew) {
        this.canDrive = canDriveNew;
    }

    @Override
    public String toString() {
        return "----------" + "\n" + "Name: " + name + "\n" + "Lastname: " + lastName + "\n" + "Age: " + age;

    }
}


