package Data_Structures.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Declaration and initialization
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Iterating through an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " -> " + numbers[i]);
        }
    }
}

/**
 ~ Arrays ~

     * Arrays are collections of elements of the same type stored in contiguous memory locations.
     * They provide fast access to elements via an index.
     * Fixed size: The size of an array is determined at the time of creation and cannot be changed.
     * Index-based access: Elements are accessed using zero-based indexing.

 * Use Cases:
     * Storing fixed-size collections.
     * Efficient access and manipulation of elements.
 */