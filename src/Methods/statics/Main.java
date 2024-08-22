package Methods.statics;

class MathUtils {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.multiply(5, 10); // Calling the static method
        System.out.println(result); // Output: 50
    }
}

/**
 Static methods belong to the class itself rather than an instance of the class. They can be called without creating an object.
 */