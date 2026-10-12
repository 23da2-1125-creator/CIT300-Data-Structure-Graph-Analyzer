package analyzer.main;

import java.util.Arrays;
import java.util.Scanner;

import analyzer.array.ArrayOperations;
import analyzer.graph.Graph;
import analyzer.linkedlist.SinglyLinkedList;
import analyzer.queue.CircularQueue;
import analyzer.searching.SearchAlgorithms;
import analyzer.stack.ArrayStack;

public class Main {

    private static final Scanner SCANNER =
            new Scanner(System.in);

    private static final ArrayOperations ARRAY =
            new ArrayOperations(20);

    private static final SinglyLinkedList LINKED_LIST =
            new SinglyLinkedList();

    private static final ArrayStack STACK =
            new ArrayStack(20);

    private static final CircularQueue QUEUE =
            new CircularQueue(20);

    private static final Graph GRAPH =
            new Graph(20);

    public static void main(String[] args) {

        System.out.println(
                "=============================================");
        System.out.println(
                "     DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println(
                "=============================================");

        boolean running = true;

        while (running) {

            displayMainMenu();

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayMenu();
                    break;

                case 2:
                    searchingMenu();
                    break;

                case 3:
                    linkedListMenu();
                    break;

                case 4:
                    stackMenu();
                    break;

                case 5:
                    queueMenu();
                    break;

                case 6:
                    graphMenu();
                    break;

                case 7:
                    performanceComparison();
                    break;

                case 0:
                    running = false;
                    System.out.println(
                            "\nSystem closed successfully.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again.");
            }
        }

        SCANNER.close();
    }

    private static void displayMainMenu() {

        System.out.println(
                "\n============== MAIN MENU ==============");
        System.out.println(
                "1. Array Operations");
        System.out.println(
                "2. Searching Algorithms");
        System.out.println(
                "3. Singly Linked List");
        System.out.println(
                "4. Stack Operations");
        System.out.println(
                "5. Circular Queue Operations");
        System.out.println(
                "6. Graph Operations");
        System.out.println(
                "7. Performance Comparison");
        System.out.println(
                "0. Exit");
        System.out.println(
                "=======================================");
    }

    private static void arrayMenu() {

        boolean back = false;

        while (!back) {

            System.out.println(
                    "\n---------- ARRAY MENU ----------");
            System.out.println(
                    "1. Insert Value");
            System.out.println(
                    "2. Delete Value");
            System.out.println(
                    "3. Search Value");
            System.out.println(
                    "4. Display Array");
            System.out.println(
                    "5. Display Array Information");
            System.out.println(
                    "0. Back to Main Menu");

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    int insertValue = readInt(
                            "Enter value to insert: ");
                    ARRAY.insert(insertValue);
                    break;

                case 2:
                    int deleteValue = readInt(
                            "Enter value to delete: ");
                    ARRAY.delete(deleteValue);
                    break;

                case 3:
                    int searchValue = readInt(
                            "Enter value to search: ");

                    int index =
                            ARRAY.search(searchValue);

                    if (index == -1) {
                        System.out.println(
                                "Value not found: "
                                + searchValue);
                    } else {
                        System.out.println(
                                "Value found at index: "
                                + index);
                    }
                    break;

                case 4:
                    ARRAY.display();
                    break;

                case 5:
                    System.out.println(
                            "Current size: "
                            + ARRAY.getSize());

                    System.out.println(
                            "Maximum capacity: "
                            + ARRAY.getCapacity());

                    System.out.println(
                            "Is array empty? "
                            + ARRAY.isEmpty());

                    System.out.println(
                            "Is array full? "
                            + ARRAY.isFull());
                    break;

                case 0:
                    back = true;
                    break;

                default:
                    System.out.println(
                            "Invalid array menu choice.");
            }
        }
    }

    private static void searchingMenu() {

        boolean back = false;

        while (!back) {

            System.out.println(
                    "\n-------- SEARCHING MENU --------");
            System.out.println(
                    "1. Linear Search");
            System.out.println(
                    "2. Binary Search");
            System.out.println(
                    "3. Display Current Array");
            System.out.println(
                    "0. Back to Main Menu");

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    performLinearSearch();
                    break;

                case 2:
                    performBinarySearch();
                    break;

                case 3:
                    ARRAY.display();
                    break;

                case 0:
                    back = true;
                    break;

                default:
                    System.out.println(
                            "Invalid searching menu choice.");
            }
        }
    }

    private static void performLinearSearch() {

        int[] values = ARRAY.getValues();

        if (values.length == 0) {
            System.out.println(
                    "Array is empty. Add values first.");
            return;
        }

        int target = readInt(
                "Enter value for linear search: ");

        int result =
                SearchAlgorithms.linearSearch(
                        values, target);

        if (result == -1) {
            System.out.println(
                    "Value not found using linear search.");
        } else {
            System.out.println(
                    "Linear Search: Value found at index "
                    + result);
        }
    }

    private static void performBinarySearch() {

        int[] values = ARRAY.getValues();

        if (values.length == 0) {
            System.out.println(
                    "Array is empty. Add values first.");
            return;
        }

        Arrays.sort(values);

        System.out.println(
                "Sorted values: "
                + Arrays.toString(values));

        int target = readInt(
                "Enter value for binary search: ");

        int result =
                SearchAlgorithms.binarySearch(
                        values, target);

        if (result == -1) {
            System.out.println(
                    "Value not found using binary search.");
        } else {
            System.out.println(
                    "Binary Search: Value found at index "
                    + result);
        }
    }

    private static void linkedListMenu() {

        boolean back = false;

        while (!back) {

            System.out.println(
                    "\n------- LINKED LIST MENU -------");
            System.out.println(
                    "1. Insert at Beginning");
            System.out.println(
                    "2. Insert at End");
            System.out.println(
                    "3. Insert After a Value");
            System.out.println(
                    "4. Search Value");
            System.out.println(
                    "5. Delete Value");
            System.out.println(
                    "6. Display Linked List");
            System.out.println(
                    "7. Display List Information");
            System.out.println(
                    "0. Back to Main Menu");

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    int beginningValue = readInt(
                            "Enter value: ");

                    LINKED_LIST.insertAtBeginning(
                            beginningValue);
                    break;

                case 2:
                    int endValue = readInt(
                            "Enter value: ");

                    LINKED_LIST.insertAtEnd(
                            endValue);
                    break;

                case 3:
                    int existingValue = readInt(
                            "Enter existing value: ");

                    int newValue = readInt(
                            "Enter new value: ");

                    LINKED_LIST.insertAfter(
                            existingValue, newValue);
                    break;

                case 4:
                    int searchValue = readInt(
                            "Enter value to search: ");

                    LINKED_LIST.search(searchValue);
                    break;

                case 5:
                    int deleteValue = readInt(
                            "Enter value to delete: ");

                    LINKED_LIST.delete(deleteValue);
                    break;

                case 6:
                    LINKED_LIST.display();
                    break;

                case 7:
                    System.out.println(
                            "Total nodes: "
                            + LINKED_LIST.getSize());

                    System.out.println(
                            "Is list empty? "
                            + LINKED_LIST.isEmpty());
                    break;

                case 0:
                    back = true;
                    break;

                default:
                    System.out.println(
                            "Invalid linked list menu choice.");
            }
        }
    }

    private static void stackMenu() {

        boolean back = false;

        while (!back) {

            System.out.println(
                    "\n---------- STACK MENU ----------");
            System.out.println(
                    "1. Push Value");
            System.out.println(
                    "2. Pop Value");
            System.out.println(
                    "3. Peek Top Value");
            System.out.println(
                    "4. Display Stack");
            System.out.println(
                    "5. Display Stack Information");
            System.out.println(
                    "0. Back to Main Menu");

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    int value = readInt(
                            "Enter value to push: ");

                    STACK.push(value);
                    break;

                case 2:
                    STACK.pop();
                    break;

                case 3:
                    STACK.peek();
                    break;

                case 4:
                    STACK.display();
                    break;

                case 5:
                    System.out.println(
                            "Stack size: "
                            + STACK.getSize());

                    System.out.println(
                            "Is stack empty? "
                            + STACK.isEmpty());

                    System.out.println(
                            "Is stack full? "
                            + STACK.isFull());
                    break;

                case 0:
                    back = true;
                    break;

                default:
                    System.out.println(
                            "Invalid stack menu choice.");
            }
        }
    }

    private static void queueMenu() {

        boolean back = false;

        while (!back) {

            System.out.println(
                    "\n------ CIRCULAR QUEUE MENU ------");
            System.out.println(
                    "1. Enqueue Value");
            System.out.println(
                    "2. Dequeue Value");
            System.out.println(
                    "3. View Front Value");
            System.out.println(
                    "4. Display Queue");
            System.out.println(
                    "5. Display Queue Information");
            System.out.println(
                    "0. Back to Main Menu");

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    int value = readInt(
                            "Enter value to enqueue: ");

                    QUEUE.enqueue(value);
                    break;

                case 2:
                    QUEUE.dequeue();
                    break;

                case 3:
                    QUEUE.front();
                    break;

                case 4:
                    QUEUE.display();
                    break;

                case 5:
                    System.out.println(
                            "Queue size: "
                            + QUEUE.getSize());

                    System.out.println(
                            "Is queue empty? "
                            + QUEUE.isEmpty());

                    System.out.println(
                            "Is queue full? "
                            + QUEUE.isFull());
                    break;

                case 0:
                    back = true;
                    break;

                default:
                    System.out.println(
                            "Invalid queue menu choice.");
            }
        }
    }

    private static void graphMenu() {

        boolean back = false;

        while (!back) {

            System.out.println(
                    "\n---------- GRAPH MENU ----------");
            System.out.println(
                    "1. Add Vertex");
            System.out.println(
                    "2. Add Edge");
            System.out.println(
                    "3. Remove Edge");
            System.out.println(
                    "4. Check Connection");
            System.out.println(
                    "5. Display Vertices");
            System.out.println(
                    "6. Display Graph");
            System.out.println(
                    "7. Breadth-First Search");
            System.out.println(
                    "8. Depth-First Search");
            System.out.println(
                    "9. Display Graph Information");
            System.out.println(
                    "0. Back to Main Menu");

            int choice = readInt(
                    "Enter your choice: ");

            switch (choice) {

                case 1:
                    String vertex = readText(
                            "Enter vertex name: ");

                    GRAPH.addVertex(vertex);
                    break;

                case 2:
                    String firstVertex = readText(
                            "Enter first vertex: ");

                    String secondVertex = readText(
                            "Enter second vertex: ");

                    GRAPH.addEdge(
                            firstVertex, secondVertex);
                    break;

                case 3:
                    String removeFirst = readText(
                            "Enter first vertex: ");

                    String removeSecond = readText(
                            "Enter second vertex: ");

                    GRAPH.removeEdge(
                            removeFirst, removeSecond);
                    break;

                case 4:
                    String checkFirst = readText(
                            "Enter first vertex: ");

                    String checkSecond = readText(
                            "Enter second vertex: ");

                    boolean connected =
                            GRAPH.hasEdge(
                                    checkFirst,
                                    checkSecond);

                    System.out.println(
                            "Connection exists: "
                            + connected);
                    break;

                case 5:
                    GRAPH.displayVertices();
                    break;

                case 6:
                    GRAPH.displayGraph();
                    break;

                case 7:
                    String bfsStart = readText(
                            "Enter BFS starting vertex: ");

                    GRAPH.breadthFirstSearch(
                            bfsStart);
                    break;

                case 8:
                    String dfsStart = readText(
                            "Enter DFS starting vertex: ");

                    GRAPH.depthFirstSearch(
                            dfsStart);
                    break;

                case 9:
                    System.out.println(
                            "Total vertices: "
                            + GRAPH.getVertexCount());

                    System.out.println(
                            "Is graph empty? "
                            + GRAPH.isEmpty());

                    System.out.println(
                            "Is graph full? "
                            + GRAPH.isFull());
                    break;

                case 0:
                    back = true;
                    break;

                default:
                    System.out.println(
                            "Invalid graph menu choice.");
            }
        }
    }

    private static void performanceComparison() {

        final int dataSize = 100000;
        int[] values = new int[dataSize];

        for (int index = 0;
                index < dataSize;
                index++) {

            values[index] = index + 1;
        }

        int target = dataSize;

        long linearStart =
                System.nanoTime();

        int linearResult =
                SearchAlgorithms.linearSearch(
                        values, target);

        long linearEnd =
                System.nanoTime();

        long binaryStart =
                System.nanoTime();

        int binaryResult =
                SearchAlgorithms.binarySearch(
                        values, target);

        long binaryEnd =
                System.nanoTime();

        long linearTime =
                linearEnd - linearStart;

        long binaryTime =
                binaryEnd - binaryStart;

        System.out.println(
                "\n===== PERFORMANCE COMPARISON =====");

        System.out.println(
                "Data size: " + dataSize);

        System.out.println(
                "Target value: " + target);

        System.out.println(
                "Linear Search result index: "
                + linearResult);

        System.out.println(
                "Linear Search time: "
                + linearTime + " nanoseconds");

        System.out.println(
                "Binary Search result index: "
                + binaryResult);

        System.out.println(
                "Binary Search time: "
                + binaryTime + " nanoseconds");

        if (binaryTime < linearTime) {

            System.out.println(
                    "Binary Search was faster in this run.");

        } else if (linearTime < binaryTime) {

            System.out.println(
                    "Linear Search was faster in this run.");

        } else {

            System.out.println(
                    "Both searches used the same time.");
        }

        System.out.println(
                "Note: Execution time may change "
                + "between runs.");
    }

    private static int readInt(
            String message) {

        while (true) {

            System.out.print(message);

            String input =
                    SCANNER.nextLine().trim();

            try {
                return Integer.parseInt(input);

            } catch (NumberFormatException exception) {

                System.out.println(
                        "Please enter a valid whole number.");
            }
        }
    }

    private static String readText(
            String message) {

        while (true) {

            System.out.print(message);

            String input =
                    SCANNER.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(
                    "Input cannot be empty.");
        }
    }
}