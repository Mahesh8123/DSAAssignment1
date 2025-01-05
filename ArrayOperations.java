public class ArrayOperations {
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor to initialize array with a given capacity
    public ArrayOperations(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arr = new int[capacity];
    }

    // Method to insert an element at the end of the array
    public void insert(int data) {
        if (size >= capacity) {
            System.out.println("Array is full. Cannot insert element.");
            return;
        }
        arr[size] = data;
        size++;
    }

    // Method to insert an element at a specified index
    public void insertAt(int data, int index) {
        if (size >= capacity) {
            System.out.println("Array is full. Cannot insert element.");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Shift elements to the right to create space for the new element
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = data;
        size++;
    }

    // Method to delete an element at a specified index
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Method to search for an element in the array
    public boolean search(int data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    // Method to display the contents of the array
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to get the length of the array
    public int length() {
        return size;
    }

    // Method to check if the array is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the array is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
