package Data_Structures.Strings;

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        String name = "Alice";

        // Concatenation
        String message = greeting + " My name is " + name;
        System.out.println(message);

        // Substring
        String sub = greeting.substring(7, 12);
        System.out.println(sub); // Output: World
    }
}

/**

 * Strings
     * Strings are sequences of characters.
     * In Java, strings are represented by the String class, which is immutable.
     * Immutable: Once created, the content of a String cannot be changed.
     * Common operations: Concatenation, comparison, and substring extraction.

 Use Cases:
     * Handling textual data.
     * Performing operations like search, replace, and format.
 */