package filereader.wordoccurence;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of WordOccurence class
        WordOccurence wordCount = new WordOccurence();

        // Specify the file path to be read
        String filePath = "file.txt";

        // Specify the word to be counted in the file
        String targetWord = "hello";

        // Call method to count occurrences of the word
        int count = wordCount.countWordOccurrences(filePath, targetWord);

        // Display the result
        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
    }
}
