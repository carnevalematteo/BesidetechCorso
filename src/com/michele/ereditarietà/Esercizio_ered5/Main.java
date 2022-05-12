package com.ereditarietà.Esercizio_ered5;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car();
        Car car2 = new Car();
        Car carTesla = new Car();

        // Imposto il nome
        car1.setName("BMW");
        car2.setName("Tesla");
        carTesla.setName("Tesla");

        //Passo come argomento del metodo l'oggetto car1
        garage.park(car1);
        garage.park(car2);
        garage.park2(carTesla);
    }
}
