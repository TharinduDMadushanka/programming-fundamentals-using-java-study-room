package Methods.Arguments.value;

public class Main {
    public static void increment(int number) {
        number++; // Modifies the copy
    }

    public static void main(String[] args) {
        int num = 5;
        increment(num);
        System.out.println(num); // Output: 5 (Original value unchanged)
    }
}
