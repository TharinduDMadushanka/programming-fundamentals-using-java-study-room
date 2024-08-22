package Methods.instance;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Creating an object
        int result = calc.add(5, 10); // Calling the instance method
        System.out.println(result); // Output: 15
    }
}

/**
 Instance methods belong to an instance of a class. You need to create an object of the class to call an instance method.
 */