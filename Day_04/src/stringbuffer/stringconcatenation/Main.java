package stringbuffer.stringconcatenation;

public class Main {
    public static void main(String[] args) {

        // Creating an instance of StringConcat class
        StringConcat concatenate = new StringConcat();

        // Define an array of strings to concatenate
        String[] words = {"Welcome", "to", "Dimension", "of", "Infinity"};

        // Call the method to concatenate strings
        String result = concatenate.concatenateStrings(words);

        // Display the concatenated result
        System.out.println("Concatenated String: " + result);
    }
}

