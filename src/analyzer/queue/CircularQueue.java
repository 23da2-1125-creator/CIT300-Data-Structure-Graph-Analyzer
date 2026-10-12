package analyzer.queue;

public class CircularQueue {

    private int[] queue;
    private int frontIndex;
    private int rearIndex;
    private int size;

    public CircularQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero.");
        }

        queue = new int[capacity];
        frontIndex = 0;
        rearIndex = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int getSize() {
        return size;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println(
                    "Queue is full. Cannot enqueue: " + value);
            return false;
        }

        rearIndex = (rearIndex + 1) % queue.length;
        queue[rearIndex] = value;
        size++;

        System.out.println(
                "Value enqueued successfully: " + value);
        return true;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println(
                    "Queue is empty. Cannot dequeue a value.");
            return null;
        }

        int removedValue = queue[frontIndex];
        queue[frontIndex] = 0;

        frontIndex = (frontIndex + 1) % queue.length;
        size--;

        if (size == 0) {
            frontIndex = 0;
            rearIndex = -1;
        }

        System.out.println(
                "Dequeued value: " + removedValue);
        return removedValue;
    }

    public Integer front() {
        if (isEmpty()) {
            System.out.println(
                    "Queue is empty. No front value.");
            return null;
        }

        System.out.println(
                "Front value: " + queue[frontIndex]);
        return queue[frontIndex];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("===== QUEUE ELEMENTS =====");

        for (int count = 0; count < size; count++) {
            int index =
                    (frontIndex + count) % queue.length;

            System.out.println(queue[index]);
        }
    }
}