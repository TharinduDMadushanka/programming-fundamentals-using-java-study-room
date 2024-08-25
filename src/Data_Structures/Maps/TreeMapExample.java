package Data_Structures.Maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

/**
 * TreeMap
     * TreeMap is a NavigableMap implementation that uses a red-black tree.
     * It provides a sorted order of keys.
     * When you need a sorted map.
     * When you need to maintain an order of keys.
 */