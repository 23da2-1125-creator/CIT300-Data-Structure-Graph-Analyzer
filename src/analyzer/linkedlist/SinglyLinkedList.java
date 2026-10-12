package analyzer.linkedlist;

public class SinglyLinkedList {

    private ListNode head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtBeginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.setNext(head);
        head = newNode;
        size++;

        System.out.println(
                "Value inserted at beginning: " + value);
    }

    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            ListNode current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        size++;

        System.out.println(
                "Value inserted at end: " + value);
    }

    public boolean insertAfter(
            int existingValue, int newValue) {

        ListNode current = head;

        while (current != null
                && current.getData() != existingValue) {
            current = current.getNext();
        }

        if (current == null) {
            System.out.println(
                    "Value not found. Cannot insert after: "
                    + existingValue);
            return false;
        }

        ListNode newNode = new ListNode(newValue);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;

        System.out.println(
                newValue + " inserted after "
                + existingValue);

        return true;
    }

    public boolean search(int value) {
        ListNode current = head;
        int position = 0;

        while (current != null) {
            if (current.getData() == value) {
                System.out.println(
                        "Value " + value
                        + " found at position: "
                        + position);
                return true;
            }

            current = current.getNext();
            position++;
        }

        System.out.println(
                "Value not found: " + value);

        return false;
    }

    public boolean delete(int value) {
        if (isEmpty()) {
            System.out.println(
                    "Linked list is empty. Cannot delete.");
            return false;
        }

        if (head.getData() == value) {
            head = head.getNext();
            size--;

            System.out.println(
                    "Value deleted successfully: " + value);
            return true;
        }

        ListNode previous = head;
        ListNode current = head.getNext();

        while (current != null
                && current.getData() != value) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println(
                    "Value not found. Cannot delete: "
                    + value);
            return false;
        }

        previous.setNext(current.getNext());
        size--;

        System.out.println(
                "Value deleted successfully: " + value);

        return true;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println(
                    "Linked list is empty.");
            return;
        }

        System.out.println(
                "===== LINKED LIST ELEMENTS =====");

        ListNode current = head;

        while (current != null) {
            System.out.print(current.getData());

            if (current.getNext() != null) {
                System.out.print(" -> ");
            }

            current = current.getNext();
        }

        System.out.println();
    }
}