package linearsearch.searchspecificword;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of SearchWord class
        SearchWord search = new SearchWord();

        // Example array of sentences
        String[] sentences = {
                "The sky is blue",
                "Java is a powerful language",
                "Artificial intelligence is the future",
                "Learning Java improves problem-solving skills"
        };

        // Taking user input for the word to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine();
        scanner.close();

        // Call method to find the first sentence containing the word
        String result = search.findSentenceWithWord(sentences, word);

        // Display the result
        System.out.println("Result: " + result);
    }
}

