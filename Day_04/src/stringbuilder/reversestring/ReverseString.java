package stringbuilder.reversestring;

public class ReverseString {
// Method to reverse a string using StringBuilder
    public static String reverseString(String input) {

        // Create a StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder(input);

        // Reverse the string using StringBuilder's reverse() method
        sb.reverse();

        // Convert StringBuilder back to a string and return
        return sb.toString();
    }
}
