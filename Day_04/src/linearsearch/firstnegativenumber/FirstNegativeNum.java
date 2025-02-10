package linearsearch.firstnegativenumber;

public class FirstNegativeNum {

    // Method to perform Linear Search for the first negative number
    public int findFirstNegative(int[] arr) {
        // Iterate through the array from start to end
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        // If no negative number is found, return -1
        return -1;
    }
}

