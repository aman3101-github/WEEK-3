package filereader.wordoccurence;

import java.io.*;

public class WordOccurence {

    // Method to count occurrences of a word in a file
    public int countWordOccurrences(String filePath, String targetWord) {
        // Counter for occurrences of word
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                // Split line into words
                String[] words = line.split("\\W+");

                // Check each word and count matches
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        // Return total count
        return count;
    }
}
