package Variables;

public class TypeCastingExample {
    public static void main(String[] args) {
        double num1 = 10.5;
        int num2 = (int) num1; // Explicit casting from double to int

        int num3 = 100;
        double num4 = num3; // Implicit casting from int to double

        System.out.println("Double to int: " + num2);
        System.out.println("Int to double: " + num4);
    }
}
