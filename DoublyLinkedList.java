// Doubly Linked List Implementation
public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Inner class for Node
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            addAtBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    // Display the list from head to tail in the format: 10 <-> 20 <-> 30 <-> null
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + " <-> ");
            } else {
                System.out.print(temp.data + " <-> null"); // Add "<-> null" at the end
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse the doubly linked list
    public void reverse() {
        if (head == null)
            return;
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
}
