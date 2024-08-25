package Data_Structures.Sets.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        for (String item : set) {
            System.out.println(item);
        }
    }
}

/**
 * TreeSet
     * TreeSet is a NavigableSet implementation that uses a red-black tree.
     * It provides a sorted order of elements.

 * Use Cases:
     * When you need a sorted collection.
     * When you need to perform operations like range queries.
 */