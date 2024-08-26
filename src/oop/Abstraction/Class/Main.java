package oop.Abstraction.Class;

abstract class Vehicle {
    abstract void start(); // Abstract method
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car starts with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}

/**
 * Abstraction
 * Definition: Abstraction is the concept of hiding the complex implementation details and showing only the essential
 * features of an object. It focuses on what an object does rather than how it does it.

 * Ways to Achieve Abstraction:

 * Abstract Class: A class that cannot be instantiated and may contain abstract methods (methods without implementation).
 * Interface: A reference type in Java that can contain only constants, method signatures, default methods, static methods,
 * and nested types. Interfaces provide a way to achieve complete abstraction.
 */