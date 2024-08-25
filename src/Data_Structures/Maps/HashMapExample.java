package Data_Structures.Maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Pear", 3);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

/**
 * Maps
    * Definition: Maps are collections of key-value pairs where each key maps to exactly one value.
    * Java provides implementations like HashMap, LinkedHashMap, and TreeMap.

 * HashMap
     * Definition: HashMap is a hash table-based implementation of the Map interface.
     * It provides constant-time performance for basic operations.
     * When you need fast lookups and do not require ordering.
     * When you need to store key-value pairs with unique keys.
 */