// TwoStacks.java
public class TwoStacks {
    // Define the maximum size of the array
    private int size;
    // Create an array to hold the elements of both stacks
    private int[] arr;
    // Top of Stack 1 starts from the beginning of the array
    private int top1;
    // Top of Stack 2 starts from the end of the array
    private int top2;

    // Constructor to initialize the two stacks
    public TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1; // Stack 1 starts empty
        top2 = size; // Stack 2 starts empty from the end
    }

    // Push element x to stack 1
    public void push1(int x) {
        // Check if there is space in the array for stack 1
        if (top1 + 1 < top2) {
            arr[++top1] = x; // Insert element at top1 and increment the top1 pointer
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    // Push element x to stack 2
    public void push2(int x) {
        // Check if there is space in the array for stack 2
        if (top2 - 1 > top1) {
            arr[--top2] = x; // Insert element at top2 and decrement the top2 pointer
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    // Pop an element from stack 1
    public int pop1() {
        // Check if stack 1 is empty
        if (top1 >= 0) {
            return arr[top1--]; // Return the top element and decrement the top1 pointer
        } else {
            System.out.println("Stack 1 Underflow");
            return -1; // Return -1 if stack 1 is empty
        }
    }

    // Pop an element from stack 2
    public int pop2() {
        // Check if stack 2 is empty
        if (top2 < size) {
            return arr[top2++]; // Return the top element and increment the top2 pointer
        } else {
            System.out.println("Stack 2 Underflow");
            return -1; // Return -1 if stack 2 is empty
        }
    }

    // Main method to test the TwoStacks class and interact with the stacks
    public static void main(String[] args) {
        // Create a TwoStacks object with a maximum size of 10
        TwoStacks stacks = new TwoStacks(10);

        // Perform operations on stack 1
        stacks.push1(5); // Push 5 to stack 1
        stacks.push1(10); // Push 10 to stack 1
        stacks.push1(15); // Push 15 to stack 1

        // Perform operations on stack 2
        stacks.push2(20); // Push 20 to stack 2
        stacks.push2(25); // Push 25 to stack 2
        stacks.push2(30); // Push 30 to stack 2

        // Pop elements from both stacks and print the results
        System.out.println("Popped from stack 1: " + stacks.pop1()); // Should print 15
        System.out.println("Popped from stack 1: " + stacks.pop1()); // Should print 10
        System.out.println("Popped from stack 1: " + stacks.pop1()); // Should print 5

        System.out.println("Popped from stack 2: " + stacks.pop2()); // Should print 30
        System.out.println("Popped from stack 2: " + stacks.pop2()); // Should print 25
        System.out.println("Popped from stack 2: " + stacks.pop2()); // Should print 20

        // Try popping from empty stacks
        System.out.println("Popped from stack 1: " + stacks.pop1()); // Should print "Stack 1 Underflow" and return -1
        System.out.println("Popped from stack 2: " + stacks.pop2()); // Should print "Stack 2 Underflow" and return -1
    }
}
