package Data_Structures.Lists.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pear");
        list.remove("Apple");

        for (String item : list) {
            System.out.println(item);
        }
    }
}

/**
 ~ LinkedList ~
     * LinkedList is a doubly linked list implementation of the List interface.
     * It allows efficient insertions and deletions but has slower access compared to ArrayList.

 * Use Cases:
     * When frequent insertions and deletions are needed.
     * When you need to maintain the order of elements.
 */