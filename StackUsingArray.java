class Stack {
    private int maxSize;  // Maximum size of the stack
    private int top;      // Index of the top element
    private int[] stackArray; // Array to store the stack elements

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stackArray[++top] = value; // Increment top and add the element
            System.out.println(value + " pushed onto stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;  // Return -1 if the stack is empty
        } else {
            int poppedValue = stackArray[top--]; // Return top element and decrement top
            return poppedValue;
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;  // Return -1 if the stack is empty
        } else {
            return stackArray[top];
        }
    }

    // Method to get the current size of the stack
    public int size() {
        return top + 1;  // Since 'top' is the index of the last element, size is top + 1
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        // Create a stack with a maximum size of 5
        Stack stack = new Stack(5);

        // Perform stack operations
        stack.push(10);  // Push 10
        stack.push(20);  // Push 20
        stack.push(30);  // Push 30
        stack.push(40);  // Push 40
        stack.push(50);  // Push 50
        stack.push(60);  // This should show "Stack is full"

        System.out.println("Top element is: " + stack.peek());  // Peek top element
        System.out.println("Stack size is: " + stack.size());   // Get stack size

        System.out.println(stack.pop() + " popped from stack."); // Pop an element
        System.out.println(stack.pop() + " popped from stack."); // Pop another element

        System.out.println("Top element after pop is: " + stack.peek());  // Peek top element after popping
        System.out.println("Stack size after popping elements: " + stack.size());  // Get stack size after popping
    }
}
