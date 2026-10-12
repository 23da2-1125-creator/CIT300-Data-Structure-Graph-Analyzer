package analyzer.stack;

public class ArrayStack {

    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero.");
        }

        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int getSize() {
        return top + 1;
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.println(
                    "Stack is full. Cannot push: " + value);
            return false;
        }

        top++;
        stack[top] = value;

        System.out.println(
                "Value pushed successfully: " + value);
        return true;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println(
                    "Stack is empty. Cannot pop a value.");
            return null;
        }

        int removedValue = stack[top];
        stack[top] = 0;
        top--;

        System.out.println(
                "Popped value: " + removedValue);
        return removedValue;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println(
                    "Stack is empty. No top value.");
            return null;
        }

        System.out.println(
                "Top value: " + stack[top]);
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("===== STACK ELEMENTS =====");

        for (int index = top; index >= 0; index--) {
            System.out.println(stack[index]);
        }
    }
}
