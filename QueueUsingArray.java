class Queue {
    private int maxSize;  // Maximum size of the queue
    private int front;    // Index of the front element
    private int rear;     // Index of the rear element
    private int[] queueArray; // Array to store the elements

    // Constructor to initialize the queue with a given size
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;  // Queue is initially empty
        rear = -1;   // Queue is initially empty
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // Method to enqueue (add) an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
        } else {
            if (front == -1) {
                front = 0;  // First element being added, so set front to 0
            }
            queueArray[++rear] = value; // Increment rear and add the element
            System.out.println(value + " enqueued to queue.");
        }
    }

    // Method to dequeue (remove) an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;  // Return -1 if the queue is empty
        } else {
            int dequeuedValue = queueArray[front];
            // If only one element was in the queue, reset the queue
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;  // Increment front to remove the element
            }
            return dequeuedValue;
        }
    }

    // Method to peek (view) the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;  // Return -1 if the queue is empty
        } else {
            return queueArray[front];
        }
    }

    // Method to get the current size of the queue
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return rear - front + 1;  // Size is calculated by the difference between rear and front
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        // Create a queue with a maximum size of 5
        Queue queue = new Queue(5);

        // Perform queue operations
        queue.enqueue(10);  // Enqueue 10
        queue.enqueue(20);  // Enqueue 20
        queue.enqueue(30);  // Enqueue 30
        queue.enqueue(40);  // Enqueue 40
        queue.enqueue(50);  // Enqueue 50
        queue.enqueue(60);  // This should show "Queue is full"

        System.out.println("Front element is: " + queue.peek());  // Peek front element
        System.out.println("Queue size is: " + queue.size());     // Get queue size

        System.out.println(queue.dequeue() + " dequeued from queue."); // Dequeue an element
        System.out.println(queue.dequeue() + " dequeued from queue."); // Dequeue another element

        System.out.println("Front element after dequeue is: " + queue.peek());  // Peek front element after dequeue
        System.out.println("Queue size after dequeuing elements: " + queue.size());  // Get queue size after dequeuing
    }
}
