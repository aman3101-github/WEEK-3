package quicksort;

public class ProductPrices {

    public void quickSort(int[] prices, int start, int end) {
        if (start < end) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(prices, start, end);

            // Recursively sort the left subarray
            quickSort(prices, start, pivotIndex - 1);

            // Recursively sort the right subarray
            quickSort(prices, pivotIndex + 1, end);
        }
    }

    private int partition(int[] prices, int start, int end) {
        // Select the pivot (last element)
        int pivot = prices[end];
        // Pointer for smaller elements
        int i = start - 1;

        // Traverse through the array and rearrange elements
        for (int j = start; j < end; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap elements to place smaller elements before pivot
                swap(prices, i, j);
            }
        }

        // Place the pivot element at its correct position
        swap(prices, i + 1, end);
        return i + 1;
    }

    private void swap(int[] prices, int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }
}
