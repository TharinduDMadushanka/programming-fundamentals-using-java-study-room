package oop.Polymorphism.override;

class Animal {
    public void sound() {
        System.out.println("This is a generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.sound(); // Calls the overridden method in Dog
    }
}

/**
 * Method Overriding (Runtime Polymorphism)
 * Definition: Method overriding occurs when a subclass provides a specific implementation of a method that is already
 * defined in its superclass.

 * Key Points:

 * Flexibility: Polymorphism allows for flexibility and the ability to extend code easily.
 * @Override Annotation: The @Override annotation is used to indicate that a method is overridden.
 */