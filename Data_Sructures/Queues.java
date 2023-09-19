package Data_Sructures;

import java.util.EmptyStackException;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (add) an element to the rear of the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            if (rear == maxSize - 1) {
                rear = -1; // Wrap around if the rear pointer reaches the end
            }
            queueArray[++rear] = value;
            size++;
        }
    }

    // Dequeue (remove and return) the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int removedValue = queueArray[front++];
            if (front == maxSize) {
                front = 0; // Wrap around if the front pointer reaches the end
            }
            size--;
            return removedValue;
        }
    }

    // Peek and return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return queueArray[front];
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == maxSize;
    }

    // Get the size of the queue
    public int size() {
        return size;
    }
}

public class Queues {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Get the size of the queue
        System.out.println("Queue size: " + queue.size());
    }
}

