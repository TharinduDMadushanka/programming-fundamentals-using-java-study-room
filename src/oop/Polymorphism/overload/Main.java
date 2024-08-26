package oop.Polymorphism.overload;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));        // Calls add(int, int)
        System.out.println(math.add(2.5, 3.5));    // Calls add(double, double)
    }
}

/**
 * Definition: Polymorphism allows objects to be treated as instances of their parent class rather than their actual class.
 * It enables a single action to be performed in different ways.

 * Types of Polymorphism:

 * Compile-Time (Static) Polymorphism: Achieved through method overloading.
 * Runtime (Dynamic) Polymorphism: Achieved through method overriding.

 * Method Overloading (Compile-Time Polymorphism)
 * Definition: Method overloading occurs when multiple methods in the same class have the same name but different parameters
 * (different type, number, or both).
 */