package challengeproblem.findelement;

public class FindElement {

    // Method to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        //  Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
// If all numbers are present, return the next positive integer
        return n + 1;
    }

    // Helper method to swap elements in an array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Method to perform Binary Search on a sorted array
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // Target found, return index
                return mid;
            } else if (nums[mid] < target) {
                // Search in the right half
                left = mid + 1;
            } else {
                // Search in the left half
                right = mid - 1;
            }
        }
        // Target not found
        return -1;
    }
}
