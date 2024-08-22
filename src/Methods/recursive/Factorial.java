package Methods.recursive;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); // 5! = 120
        System.out.println(result); // Output: 120
    }
}

/**
 A recursive method is a method that calls itself in order to solve a problem. Recursion is often used for tasks that can be divided into similar sub-tasks.
 */