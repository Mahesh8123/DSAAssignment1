// Main.java
public class Main {
    public static void main(String[] args) {
        // Singly Linked List Test
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(10);
        sll.add(20);
        sll.addAtBeginning(5);
        sll.insertAtPosition(15, 2);
        sll.display();
        sll.reverse();
        sll.display();

        // Doubly Linked List Test
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.addAtBeginning(5);
        dll.insertAtPosition(15, 2);
        dll.display();
        dll.reverse();
        dll.display();

        // Circular Linked List Test
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(10);
        cll.add(20);
        cll.addAtBeginning(5);
        cll.insertAtPosition(15, 2);
        cll.display();
        cll.reverse();
        cll.display();

        // Array Operations Test
        ArrayOperations arrayOps = new ArrayOperations(5);
        arrayOps.insert(10);
        arrayOps.insert(20);
        arrayOps.insert(30);
        arrayOps.insertAt(25, 2);
        arrayOps.display();
        arrayOps.deleteAt(1);
        arrayOps.display();
        System.out.println("Element 25 found: " + arrayOps.search(25));
        System.out.println("Array length: " + arrayOps.length());
        System.out.println("Is array full: " + arrayOps.isFull());
        System.out.println("Is array empty: " + arrayOps.isEmpty());

        // TwoStacks Test
        TwoStacks stacks = new TwoStacks(10);
        stacks.push1(5);
        stacks.push1(10);
        stacks.push1(15);
        stacks.push2(20);
        stacks.push2(25);
        stacks.push2(30);
        System.out.println("Popped from stack 1: " + stacks.pop1());
        System.out.println("Popped from stack 2: " + stacks.pop2());
        System.out.println("Popped from stack 1: " + stacks.pop1());
        System.out.println("Popped from stack 2: " + stacks.pop2());

        // Queue Test
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.display();
        System.out.println("Peek: " + queue.peek()); // Peek at the front element
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("Is Queue empty: " + queue.isEmpty()); // Check if queue is empty

        // ArrayList Test
        ArrayListExample arrayList = new ArrayListExample();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.remove(20);
        arrayList.display();
        System.out.println("Contains 30: " + arrayList.contains(30)); // Check if 30 is in the list
        System.out.println("ArrayList size: " + arrayList.size()); // Get the size of the list
        arrayList.clear();
        arrayList.display();

        // HashSet Test
        HashSetExample hashSet = new HashSetExample();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20); // Duplicate will not be added
        hashSet.remove(20);
        hashSet.display();
        System.out.println("Contains 10: " + hashSet.contains(10)); // Check if 10 is in the set
        System.out.println("HashSet size: " + hashSet.size()); // Get the size of the set
        hashSet.clear();
        hashSet.display();
    }
}
