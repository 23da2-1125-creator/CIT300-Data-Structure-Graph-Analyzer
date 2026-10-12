package analyzer.array;

import analyzer.searching.SearchAlgorithms;

public class ArraySearchingTest {

    public static void main(String[] args) {

        ArrayOperations array = new ArrayOperations(5);

        System.out.println("========== ARRAY TEST ==========");

        System.out.println("\n--- INSERT TEST ---");

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);

        System.out.println("\n--- FULL ARRAY TEST ---");

        array.insert(60);

        System.out.println("\n--- DISPLAY TEST ---");

        array.display();

        System.out.println("\n--- ARRAY SEARCH TEST ---");

        int arraySearchIndex = array.search(30);

        if (arraySearchIndex != -1) {
            System.out.println(
                    "Value 30 found at index: "
                    + arraySearchIndex);
        } else {
            System.out.println("Value 30 not found.");
        }

        System.out.println("\n--- DELETE TEST ---");

        array.delete(20);
        array.display();

        System.out.println("\n--- DELETE NOT FOUND TEST ---");

        array.delete(99);

        int[] values = array.getValues();

        System.out.println(
                "\n========== SEARCHING TEST ==========");

        System.out.println("\n--- LINEAR SEARCH TEST ---");

        int linearIndex =
                SearchAlgorithms.linearSearch(values, 40);

        if (linearIndex != -1) {
            System.out.println(
                    "Linear Search: Value 40 found at index: "
                    + linearIndex);
        } else {
            System.out.println(
                    "Linear Search: Value 40 not found.");
        }

        System.out.println(
                "\n--- BINARY SEARCH TEST ---");

        int binaryIndex =
                SearchAlgorithms.binarySearch(values, 50);

        if (binaryIndex != -1) {
            System.out.println(
                    "Binary Search: Value 50 found at index: "
                    + binaryIndex);
        } else {
            System.out.println(
                    "Binary Search: Value 50 not found.");
        }

        System.out.println(
                "\n--- SEARCH NOT FOUND TEST ---");

        int missingIndex =
                SearchAlgorithms.linearSearch(values, 99);

        if (missingIndex == -1) {
            System.out.println(
                    "Value 99 was not found.");
        }

        System.out.println("\n===== TESTING COMPLETED =====");
    }
}