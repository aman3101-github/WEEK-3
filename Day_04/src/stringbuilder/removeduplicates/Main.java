package stringbuilder.removeduplicates;

public class Main {
    public static void main(String[] args) {

        // Creating instance of the RemoveDuplicate class
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();

        // Call method to remove duplicates and display the result
        String uniqueString = removeDuplicate.removeDuplicates("hellohellostring");

        // Displaying the results
        System.out.println("String after removing duplicates: " + uniqueString);
    }
}
