
// HashSetExample.java
import java.util.HashSet;

public class HashSetExample {
    private HashSet<Integer> set;

    // Constructor
    public HashSetExample() {
        set = new HashSet<>();
    }

    // Add an element to the set
    public void add(int element) {
        set.add(element);
        System.out.println("Added: " + element);
    }

    // Remove an element from the set
    public void remove(int element) {
        if (set.remove(element)) {
            System.out.println("Removed: " + element);
        } else {
            System.out.println("Element not found: " + element);
        }
    }

    // Check if the set contains an element
    public boolean contains(int element) {
        return set.contains(element);
    }

    // Clear the set
    public void clear() {
        set.clear();
        System.out.println("HashSet cleared.");
    }

    // Get the size of the set
    public int size() {
        return set.size();
    }

    // Display the set
    public void display() {
        System.out.println("HashSet: " + set);
    }
}
