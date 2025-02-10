
package searchalgorithmcomparision;

public class LinearSearch {

    // Method to perform linear search on the datasets
    public static int search(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the target is found, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // Return -1 if target is not found
        return -1;
    }
}

