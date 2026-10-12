package analyzer.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {

        SinglyLinkedList list =
                new SinglyLinkedList();

        System.out.println(
                "========== LINKED LIST TEST ==========");

        System.out.println(
                "\n--- EMPTY LIST TEST ---");
        list.display();
        list.delete(10);

        System.out.println(
                "\n--- INSERT AT END TEST ---");
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        System.out.println(
                "\n--- INSERT AT BEGINNING TEST ---");
        list.insertAtBeginning(5);
        list.display();

        System.out.println(
                "\n--- INSERT AFTER TEST ---");
        list.insertAfter(20, 25);
        list.display();

        System.out.println(
                "\n--- INSERT AFTER NOT FOUND TEST ---");
        list.insertAfter(99, 100);

        System.out.println(
                "\n--- SEARCH TEST ---");
        list.search(25);

        System.out.println(
                "\n--- SEARCH NOT FOUND TEST ---");
        list.search(99);

        System.out.println(
                "\n--- DELETE FIRST NODE TEST ---");
        list.delete(5);
        list.display();

        System.out.println(
                "\n--- DELETE MIDDLE NODE TEST ---");
        list.delete(20);
        list.display();

        System.out.println(
                "\n--- DELETE LAST NODE TEST ---");
        list.delete(30);
        list.display();

        System.out.println(
                "\n--- DELETE NOT FOUND TEST ---");
        list.delete(99);

        System.out.println(
                "\n--- LIST SIZE TEST ---");
        System.out.println(
                "Total values: " + list.getSize());

        System.out.println(
                "\n===== TESTING COMPLETED =====");
    }
}