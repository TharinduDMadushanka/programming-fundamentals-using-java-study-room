package Variables;

public class VariableExample {
    public static void main(String[] args) {
        // Primitive variables
        int age = 25;
        double salary = 50000.50;
        boolean isEmployed = true;

        // Reference variable
        String name = "John Doe";

        // Print variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employed: " + isEmployed);
    }
}

/**
 ~ Primitive Data Types ~
     * byte (1 byte) -> byte b = 100;
     * short (2 bytes) -> short s = 5000;
     * int (4 bytes) -> int i = 100000;
     * long (8 bytes) -> long l = 100000L;
     * float (4 bytes) -> float f = 5.75f;
     * boolean (1 bit) -> boolean isJavaFun = true;
     * char (2 bytes) -> char letter = 'A';

 ~ Reference/Object Data Types ~
     * Strings -> String greeting = "Hello, World!";
     * Arrays -> int[] numbers = {1, 2, 3, 4, 5};
     * Classes and Objects -
     * Interfaces -> List<String> list = new ArrayList<>();

 ~ Type Conversion and Casting ~

     * Implicit Conversion (Widening Conversion) -> int num = 100;
                                                    double doubleNum = num; // int to double

     * Explicit Conversion (Narrowing Conversion) -> double doubleNum = 9.78;
                                                    int intNum = (int) doubleNum; // double to int
 */