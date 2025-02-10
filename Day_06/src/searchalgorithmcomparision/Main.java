package searchalgorithmcomparision;

import java.util.Arrays;
import java.util.Random;

public class Main {
    // Instantiate the Random class
    static Random random = new Random();

    // Method to generate dataset for each dataset sizes
    public static int[] generateDataset(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000);
        }
        return arr;
    }

   // Method to compare the search time for linear and binary search
    public static void compareSearchAlgorithms() {
        // Dataset sizes to test
        int[] datasetSizes = {1000, 10000, 1000000};
        int target = 2000;

        // Iterate through different dataset sizes
        for (int size : datasetSizes) {
            System.out.println("\nDataset Size: " + size);

            // Generate dataset
            int[] dataset = generateDataset(size);

            // Measure time for Linear Search
            long startTime = System.nanoTime();
            int linearResult = LinearSearch.search(dataset, target);
            long endTime = System.nanoTime();
            long linearTime = endTime - startTime;
            System.out.println("Linear Search Time: " + (linearTime / 1_000_000.0) + " ms");

            // Sort dataset for Binary Search
            Arrays.sort(dataset);

            // Measure time for Binary Search
            startTime = System.nanoTime();
            int binaryResult = BinarySearch.search(dataset, target);
            endTime = System.nanoTime();
            long binaryTime = endTime - startTime;
            System.out.println("Binary Search Time: " + (binaryTime / 1_000_000.0) + " ms");

            // Display search results
            System.out.println("Linear Search Found at Index: " + linearResult);
            System.out.println("Binary Search Found at Index: " + binaryResult);
        }
    }

   // Main method
    public static void main(String[] args) {

        // Method call to compare the search time for both the searches
        compareSearchAlgorithms();
    }
}
