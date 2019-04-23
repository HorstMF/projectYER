package nl.yer.carcase.domain;

import nl.yer.carcase.domain.Car;

import java.lang.reflect.Array;


public class CarApp {
    public CarApp() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my very first car application! Yahoo!");

        Car Audi = new Car(60);
        Car BMW = new Car(100);

//use dot syntax to access their attributes and methods

        Audi.setSpeed(200);
        BMW.setSpeed(220);
        Audi.setPrice(20000);
        BMW.setPrice(30000);
        BMW.horn();






/*
getter method: returns value of attribute
setter method: takes parameter and assigns it to the attribute
 */






    }
}
