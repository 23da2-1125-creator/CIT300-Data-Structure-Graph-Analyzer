package analyzer.array;

public class ArrayOperations {

    private int[] values;
    private int size;

    public ArrayOperations(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero.");
        }

        values = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == values.length;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return values.length;
    }

    public boolean insert(int value) {
        if (isFull()) {
            System.out.println(
                    "Array is full. Cannot insert: " + value);
            return false;
        }

        values[size] = value;
        size++;

        System.out.println(
                "Value inserted successfully: " + value);
        return true;
    }

    public int search(int value) {
        for (int index = 0; index < size; index++) {
            if (values[index] == value) {
                return index;
            }
        }

        return -1;
    }

    public boolean delete(int value) {
        int index = search(value);

        if (index == -1) {
            System.out.println(
                    "Value not found. Cannot delete: " + value);
            return false;
        }

        for (int position = index;
                position < size - 1;
                position++) {

            values[position] = values[position + 1];
        }

        size--;
        values[size] = 0;

        System.out.println(
                "Value deleted successfully: " + value);
        return true;
    }

    public int[] getValues() {
        int[] activeValues = new int[size];

        for (int index = 0; index < size; index++) {
            activeValues[index] = values[index];
        }

        return activeValues;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("===== ARRAY ELEMENTS =====");

        for (int index = 0; index < size; index++) {
            System.out.println(
                    "Index " + index + ": " + values[index]);
        }
    }
}