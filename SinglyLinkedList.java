// Singly Linked List Implementation
public class SinglyLinkedList {
    private Node head;

    // Inner class to define Node
    private class Node {
        int data;
        Node next;

        // Node constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If the list is empty, make the new node as the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the end of the list
            }
            temp.next = newNode; // Add the new node at the end
        }
    }

    // Add a node at the beginning of the list
    public void addAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Make the new node as the head
    }

    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data); // Create a new node
        if (position == 0) {
            addAtBeginning(data); // If position is 0, add at the beginning
            return;
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next; // Link the new node to the next node
        temp.next = newNode; // Link the previous node to the new node
    }

    // Display the list in the format: 10 -> 20 -> 30 -> null
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + " -> ");
            } else {
                System.out.print(temp.data + " -> null"); // Add "-> null" at the end
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev and current one step forward
            current = next;
        }
        head = prev; // Make the last node as the new head
    }
}
