package Data_Structures.Advanced.HashTable;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Apple", 1);
        table.put("Banana", 2);

        for (String key : table.keySet()) {
            System.out.println(key + ": " + table.get(key));
        }
    }
}

/**
 * Hash Table
     * DA hash table stores key-value pairs and provides efficient lookup based on hashing.
     * When you need to store key-value pairs with efficient lookups and no null values.
 */