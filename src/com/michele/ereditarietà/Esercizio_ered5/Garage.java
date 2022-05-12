package com.ereditarietà.Esercizio_ered5;

public class Garage {
    // Vogliamo passare un oggetto come parametro quindi:
    public void park(Car carNew){
        System.out.println("The " + carNew.name + " is parked in the garage.");
    }

    public void park2(Car carNew){
        System.out.println(carNew + "is parked.");
    }
}
