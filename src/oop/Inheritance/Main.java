package oop.Inheritance;

// Superclass
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Subclass method
    }
}

/**
 * Definition: Inheritance is the mechanism by which one class (the subclass or child class) inherits the attributes and
 * behaviors (fields and methods) of another class (the superclass or parent class).
 * It promotes code reuse and establishes a relationship between classes.\

 * Types of Inheritance in Java:

 * Single Inheritance: A subclass inherits from one superclass.
 * Multilevel Inheritance: A subclass inherits from a superclass, and another class inherits from that subclass.
 * Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.

 * Key Points:

 * super Keyword: The super keyword is used to refer to the immediate parent class object.
 * Method Overriding: A subclass can provide a specific implementation for a method that is already defined in its superclass.
 */