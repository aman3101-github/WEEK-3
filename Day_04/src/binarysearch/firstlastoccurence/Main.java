package binarysearch.firstlastoccurence;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of FirstLastOccurrence class
        FirstLastOccurence search = new FirstLastOccurence();

        // Example sorted array
        int[] nums = {21, 41, 41, 54, 54, 77};

        // Target value to search
        int target = 54;

        // Find first and last occurrence
        int[] result = search.findFirstAndLast(nums, target);

        // Display the result
        System.out.println("First and Last Occurrence of " + target + ": " + Arrays.toString(result));
    }
}
