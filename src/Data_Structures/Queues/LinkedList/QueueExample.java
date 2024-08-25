package Data_Structures.Queues.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");

        System.out.println(queue.peek());
        queue.remove();

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Retrieves and removes the head of the queue
        }
    }
}

/**
 *Queues
     * Queues are collections that follow the First-In-First-Out (FIFO) principle.
     * Java provides implementations like LinkedList (also implements Queue) and PriorityQueue.

 * LinkedList as Queue
     * Definition: LinkedList can be used as a queue, providing FIFO operations.
     * When you need to process items in the order they are added.
 */