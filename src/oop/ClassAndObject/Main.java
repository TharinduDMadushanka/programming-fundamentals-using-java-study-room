package oop.ClassAndObject;

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2022);

        // Accessing object methods
        myCar.startEngine();
        myCar.stopEngine();
    }
}

/**
 * Definition: An object is an instance of a class. It represents a real-world entity with attributes and behaviors defined by its class.
 * Creation: Objects are created using the new keyword followed by a call to a constructor.
 *
 * Key Points:

 * Encapsulation: Objects encapsulate data and behavior.
 * State and Behavior: Objects have a state (defined by fields) and behavior (defined by methods).
 */