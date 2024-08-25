package Data_Structures.Sets.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate value, will not be added

        for (String item : set) {
            System.out.println(item);
        }
    }
}

/**

 * HashSet
     * HashSet is a hash table-based implementation of the Set interface.
     * It provides constant-time performance for basic operations.

 * Use Cases:
     * When you need to ensure unique elements.
     * When you do not need to maintain any specific order.

 */