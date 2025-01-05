
// Queue.java
import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> queue;

    // Constructor
    public Queue() {
        queue = new LinkedList<>();
    }

    // Enqueue: Add an element to the end of the queue
    public void enqueue(int element) {
        queue.addLast(element);
        System.out.println("Enqueued: " + element);
    }

    // Dequeue: Remove and return the element at the front of the queue
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int element = queue.removeFirst();
        System.out.println("Dequeued: " + element);
        return element;
    }

    // Peek: View the front element without removing it
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Display the queue
    public void display() {
        System.out.println("Queue: " + queue);
    }
}
