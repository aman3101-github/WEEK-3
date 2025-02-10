package stringbuilder.removeduplicates;
import java.util.HashSet;

public class RemoveDuplicate {

    // Method to remove duplicate characters
    public String removeDuplicates(String input) {
        // HashSet to track characters
        HashSet<Character> uniqueChar = new HashSet<>();

        // StringBuilder to store the unique characters
        StringBuilder sb = new StringBuilder();

        // Iterate over each character in the string
        for (char ch : input.toCharArray()) {
            // If character is not already in HashSet, add it to StringBuilder and HashSet
            if (!uniqueChar.contains(ch)) {
                uniqueChar.add(ch);
                sb.append(ch);
            }
        }

        // Convert StringBuilder back to string and return
        return sb.toString();
    }
}

