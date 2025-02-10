package mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] bookPrices = {1000, 1540, 2540, 680, 900};

        System.out.println("Original Prices: " + Arrays.toString(bookPrices));

        SortBookPrices sorter = new SortBookPrices();
        sorter.mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(bookPrices));
    }
}
