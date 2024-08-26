package oop.ClassAndObject;

public class Car {
    // Fields
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void startEngine() {
        System.out.println("The engine of the " + brand + " " + model + " is started.");
    }

    public void stopEngine() {
        System.out.println("The engine is stopped.");
    }
}

/**
 * Definition: A class is a blueprint or template for creating objects.
 * It defines the attributes (fields) and behaviors (methods) that the objects created from the class will have.
 */