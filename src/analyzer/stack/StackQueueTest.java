package analyzer.stack;

import analyzer.queue.CircularQueue;

public class StackQueueTest {

    public static void main(String[] args) {

        System.out.println(
                "========== STACK TEST ==========");

        ArrayStack stack = new ArrayStack(3);

        System.out.println("\n--- EMPTY STACK TEST ---");
        stack.pop();
        stack.peek();

        System.out.println("\n--- PUSH TEST ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\n--- FULL STACK TEST ---");
        stack.push(40);

        System.out.println("\n--- DISPLAY STACK ---");
        stack.display();

        System.out.println("\n--- PEEK TEST ---");
        stack.peek();

        System.out.println("\n--- POP TEST ---");
        stack.pop();
        stack.display();

        System.out.println("\n--- CLEAR STACK TEST ---");
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(
                "\n========== QUEUE TEST ==========");

        CircularQueue queue = new CircularQueue(3);

        System.out.println("\n--- EMPTY QUEUE TEST ---");
        queue.dequeue();
        queue.front();

        System.out.println("\n--- ENQUEUE TEST ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("\n--- FULL QUEUE TEST ---");
        queue.enqueue(40);

        System.out.println("\n--- DISPLAY QUEUE ---");
        queue.display();

        System.out.println("\n--- FRONT TEST ---");
        queue.front();

        System.out.println("\n--- DEQUEUE TEST ---");
        queue.dequeue();
        queue.display();

        System.out.println(
                "\n--- CIRCULAR QUEUE TEST ---");

        queue.enqueue(40);
        queue.display();

        System.out.println("\n--- CLEAR QUEUE TEST ---");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(
                "\n===== TESTING COMPLETED =====");
    }
}