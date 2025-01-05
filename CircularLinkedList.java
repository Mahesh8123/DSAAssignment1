// Circular Linked List Implementation
public class CircularLinkedList {
    private Node head;

    // Inner class for Node
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself, making it circular
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // Traverse until we reach the last node
            }
            temp.next = newNode; // Add the new node
            newNode.next = head; // Make the list circular
        }
    }

    // Add a node at the beginning of the list
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular link
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // Traverse until we reach the last node
            }
            newNode.next = head; // Point the new node to head
            head = newNode; // Make the new node as the head
            temp.next = head; // Make the last node point to the new head
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
            if (temp.next == head) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the list in a circular format
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Reverse the circular linked list
    public void reverse() {
        if (head == null)
            return;
        Node current = head, prev = null, next = null;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);
        head.next = prev;
        head = prev;
    }
}
