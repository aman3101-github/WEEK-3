package binarysearch.firstlastoccurence;

public class FirstLastOccurence {

        // Method to find first and last occurrence of a target element in a sorted array
        public int[] findFirstAndLast(int[] nums, int target) {
            // Find first occurrence
            int first = findOccurrence(nums, target, true);
            // Find last occurrence
            int last = findOccurrence(nums, target, false);
            return new int[]{first, last};
        }

        // Helper method to perform binary search for first or last occurrence
        private int findOccurrence(int[] nums, int target, boolean findFirst) {
            int left = 0, right = nums.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    // Target found, store the index
                    result = mid;
                    if (findFirst) {
                        // Search in the left half for first occurrence
                        right = mid - 1;
                    } else {
                        // Search in the right half for last occurrence
                        left = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    // Search in the right half
                    left = mid + 1;
                } else {
                    // Search in the left half
                    right = mid - 1;
                }
            }
            // Return index or -1 if not found
            return result;
        }
    }

