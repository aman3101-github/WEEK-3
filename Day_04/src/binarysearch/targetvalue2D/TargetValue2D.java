package binarysearch.targetvalue2D;

public class TargetValue2D {

        // Method to perform Binary Search in a 2D sorted matrix
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;
            int left = 0, right = rows * cols - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int row = mid / cols;
                int col = mid % cols;
                int midValue = matrix[row][col];

                if (midValue == target) {
                    // Target element found
                    return true;
                } else if (midValue < target) {
                    // Search right half
                    left = mid + 1;
                } else {
                    // Search left half
                    right = mid - 1;
                }
            }
            // Target not found
            return false;
        }
    }
