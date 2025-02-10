package challengeproblem.findelement;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of SearchUtility
        FindElement search = new FindElement();

        //  list of integers
        int[] nums = {3, 4, -1, 1, 7, 2, 5};

        // Find the first missing positive integer using Linear Search
        int missingPositive = FindElement.findFirstMissingPositive(nums);
        System.out.println("First Missing Positive Integer: " + missingPositive);

        //  target for Binary Search
        int target = 5;

        // Sort the array before performing Binary Search
        Arrays.sort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));

        // Find the target index using Binary Search
        int targetIndex = FindElement.binarySearch(nums, target);
        System.out.println("Index of " + target + ": " + targetIndex);
    }
}
