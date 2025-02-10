package linearsearch.firstnegativenumber;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of FirstNegativeNum
        FirstNegativeNum negativeNum = new FirstNegativeNum();

        // Example array containing positive and negative numbers
        int[] numbers = {25, -5, 18, -2, 0, 45, 40};

        // Call method to find first negative number and get the index
        int index = negativeNum.findFirstNegative(numbers);

        // Display the result
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
