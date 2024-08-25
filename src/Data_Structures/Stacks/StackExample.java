package Data_Structures.Stacks;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Retrieves and removes the top of the stack
        }
    }
}

/**
 * Stacks
     * Stacks are collections that follow the Last-In-First-Out (LIFO) principle.
     * Java provides a Stack class as part of the Java Collections Framework
     * When you need to process items in reverse order of their addition.
     * Commonly used in algorithms like depth-first search and expression evaluation.
 */