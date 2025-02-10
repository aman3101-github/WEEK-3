package binarysearch.targetvalue2D;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MatrixSearch
        TargetValue2D search = new TargetValue2D();

        // Example 2D sorted matrix
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        // Target value to search
        int target = 15;

        // Call method to search for the target
        boolean found = search.searchMatrix(matrix, target);

        // Display the result
        System.out.println("Target element " + target + " found: " + found);
    }
}
