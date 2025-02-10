package searchalgorithmcomparision;

import java.util.Arrays;
public class BinarySearch {

    // Method to perform binary search on the datasets
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Continue searching while left index is less than or equal to right
        while (left <= right) {
            // Calculate middle index
            int mid = left + (right - left) / 2;

            // If target is found, return index
            if (arr[mid] == target) {
                return mid;
            }
            // If target is smaller, search in left half
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            // If target is greater, search in right half
            else {
                left = mid + 1;
            }
        }
        // Return -1 if target is not found
        return -1;
    }
}
