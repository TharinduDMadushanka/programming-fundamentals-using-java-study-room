package Data_Structures.Advanced.ConcurrentDataStructures;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

/**
 * Concurrent Data Structures
 * Java provides concurrent data structures like ConcurrentHashMap and BlockingQueue for thread-safe operations.
 * When you need thread-safe collections for concurrent programming.
 */