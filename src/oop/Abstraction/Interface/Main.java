package oop.Abstraction.Interface;

interface Animal {
    void sound(); // Abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}

/**
 * Key Points:
 *
 * Interfaces vs. Abstract Classes: Interfaces provide complete abstraction and allow multiple inheritance,
 * while abstract classes provide partial abstraction and cannot be used for multiple inheritance.
 * Flexibility: Abstraction helps in managing complexity and improving code readability.
 */