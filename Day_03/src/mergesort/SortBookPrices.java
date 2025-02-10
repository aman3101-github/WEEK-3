package mergesort;

public class SortBookPrices {

    // Method to perform Merge Sort
    public void mergeSort(int[] prices, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            // Sort left half
            mergeSort(prices, start, mid);
            // Sort right half
            mergeSort(prices, mid + 1, end);
            // Merge sorted halves
            merge(prices, start, mid, end);
        }
    }

    // Merge two sorted halves
    private void merge(int[] prices, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy data to temporary arrays
        System.arraycopy(prices, start, left, 0, leftSize);
        System.arraycopy(prices, mid + 1, right, 0, rightSize);

        int i = 0, j = 0, k = start;

        // Merge the two arrays
        while (i < leftSize && j < rightSize) {
            prices[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }

        // Copy remaining elements
        while (i < leftSize) {
            prices[k++] = left[i++];
        }

        while (j < rightSize) {
            prices[k++] = right[j++];
        }
    }
}
