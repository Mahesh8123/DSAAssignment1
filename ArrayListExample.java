
// ArrayListExample.java
import java.util.ArrayList;

public class ArrayListExample {
    private ArrayList<Integer> list;

    // Constructor
    public ArrayListExample() {
        list = new ArrayList<>();
    }

    // Add an element to the list
    public void add(int element) {
        list.add(element);
        System.out.println("Added: " + element);
    }

    // Remove an element from the list
    public void remove(int element) {
        if (list.remove(Integer.valueOf(element))) {
            System.out.println("Removed: " + element);
        } else {
            System.out.println("Element not found: " + element);
        }
    }

    // Check if the list contains an element
    public boolean contains(int element) {
        return list.contains(element);
    }

    // Clear the list
    public void clear() {
        list.clear();
        System.out.println("ArrayList cleared.");
    }

    // Get the size of the list
    public int size() {
        return list.size();
    }

    // Display the list
    public void display() {
        System.out.println("ArrayList: " + list);
    }
}
