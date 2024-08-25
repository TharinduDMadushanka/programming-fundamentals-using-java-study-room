package Data_Structures.Lists.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.remove("Banana");
//        list.clear();

        for (String item : list) {
            System.out.println(item);
        }
    }
}

/**
 ~ ArrayList ~
     * ArrayList is a resizable array implementation of the List interface.
     * It allows fast random access but slower insertion and deletion compared to LinkedList

 * Use Cases:
     * When frequent access and occasional insertions/deletions are needed.
     * When you need a dynamic array with flexible size
 */