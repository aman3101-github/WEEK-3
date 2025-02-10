package linearsearch.searchspecificword;

public class SearchWord {

    // Method to perform Linear Search for a word in sentences
    public String findSentenceWithWord(String[] sentences, String word) {

        // Iterate through the list of sentences
        for (String sentence : sentences) {
            // Check if the sentence contains the word, not case-sensitive
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                // Return the first matching sentence
                return sentence;
            }
        }
        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }
}
