package nl.yer.carcase.domain;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.lang.reflect.Array;

public class Car {

    //fields

    private int speed;
    private double price;
    private String licencePlate;
    private double fuel;



    //constructor

    public Car(int speed) {
        this.speed = speed;
    }

//getter and setter for speed

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        //keyword this is used to refer to current object. this.color is the color attribute of the current object.
    }
    //price

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //LicencePlate

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String name) {
        this.licencePlate = name;
    }
    //getfuel

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }


    //method horn

    public void horn(){
        System.out.println("Beep!");

    }


}
