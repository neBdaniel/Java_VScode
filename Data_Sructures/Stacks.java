package Data_Sructures;
import java.util.EmptyStackException;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize the top pointer to -1 (empty stack)
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top--];
        }
    }

    // Peek and return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }
}

public class Stacks {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}

