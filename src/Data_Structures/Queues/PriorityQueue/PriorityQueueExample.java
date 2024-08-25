package Data_Structures.Queues.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Retrieves and removes the highest-priority element
        }
    }
}

/**
 * PriorityQueue
     * PriorityQueue is a queue that orders elements based on their natural ordering or a comparator.
     * When you need elements to be processed based on priority.
     * When you need an ordered queue.
 */