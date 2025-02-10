package quicksort;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Input for the unsorted array
        int[] productPrices = {500, 690, 750, 900, 250};

        // Original unsorted array
        System.out.println("Original Prices: " + Arrays.toString(productPrices));

        // Creating the instance of the class
        ProductPrices sortPrice = new ProductPrices();

        // Method calling to sort the price array
        sortPrice.quickSort(productPrices, 0, productPrices.length - 1);

        // Display the sorted price array
        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
