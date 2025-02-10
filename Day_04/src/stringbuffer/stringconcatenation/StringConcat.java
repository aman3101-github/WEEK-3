package stringbuffer.stringconcatenation;

public class StringConcat {

    // Method to concatenate an array of strings using StringBuffer
    public String concatenateStrings(String[] words) {
        // Using StringBuffer for efficient concatenation
        StringBuffer sb = new StringBuffer();

        // Iterate through each string in the array and append it
        for (int str = 0; str<words.length; str++) {
            sb.append(words[str]).append(" ");
        }

        // Convert StringBuffer to String and return after trimming the last space
        return sb.toString().trim();
    }
}
