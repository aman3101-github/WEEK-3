package sortlargedatasetefficiently;

import java.util.Random;
import java.util.Arrays;

public class Main {
    // Instantiate the Random class
    static Random random = new Random();

    // Method to generate random dataset
    public static int[] generateDataset(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000);
        }
        return arr;
    }

    // Method to compare sorting algorithms
    public static void compareSortingAlgorithms() {
        int[] datasetSizes = {1000, 10000, 1000000};

        for (int size : datasetSizes) {
            System.out.println("\nDataset Size: " + size);
            int[] dataset = generateDataset(size);

            // Measure Bubble Sort time
            if (size <= 10000) {
                int[] bubbleData = Arrays.copyOf(dataset, dataset.length);
                long start = System.nanoTime();
                BubbleSort.sort(bubbleData);
                long end = System.nanoTime();
                System.out.println("Bubble Sort Time: " + (end - start) / 1000000.0 + " ms");
            } else {
                System.out.println("Bubble Sort is inefficient for larger dataset of size " + size);
            }

            // Measure Merge Sort time
            int[] mergeData = Arrays.copyOf(dataset, dataset.length);
            long start = System.nanoTime();
            MergeSort.sort(mergeData, 0, mergeData.length - 1);
            long end = System.nanoTime();
            System.out.println("Merge Sort Time: " + (end - start) / 1000000.0 + " ms");

            // Measure Quick Sort time
            int[] quickData = Arrays.copyOf(dataset, dataset.length);
            start = System.nanoTime();
            QuickSort.sort(quickData, 0, quickData.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort Time: " + (end - start) / 1000000.0 + " ms");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Method call to compare the sorting algorithms
        compareSortingAlgorithms();
    }
}
