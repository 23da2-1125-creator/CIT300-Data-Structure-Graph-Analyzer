package analyzer.searching;

public class SearchAlgorithms {

    private SearchAlgorithms() {
        // Prevent object creation
    }

    public static int linearSearch(
            int[] values, int target) {

        if (values == null) {
            return -1;
        }

        for (int index = 0;
                index < values.length;
                index++) {

            if (values[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public static int binarySearch(
            int[] sortedValues, int target) {

        if (sortedValues == null) {
            return -1;
        }

        int low = 0;
        int high = sortedValues.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (sortedValues[middle] == target) {
                return middle;
            }

            if (sortedValues[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}