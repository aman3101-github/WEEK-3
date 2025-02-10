package binarysearch.peakelement;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of PeakElement class
        PeakElement peakElement = new PeakElement();

        // Example array with peak elements
        int[] arr = {14, 33, 20, 44, 81, 50};

        // Call method to find a peak element index
        int peakIndex = peakElement.findPeakElement(arr);

        // Display the result
        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);
    }
}

