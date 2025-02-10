package stringconcatenation;

public class Concatenation {
    // Concatenation using String
    public static long concatenateUsingString(int n) {
        long start = System.nanoTime();
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        long end = System.nanoTime();
        // Convert to milliseconds
        return (end - start) / 1000000;
    }

    // Concatenation using StringBuilder - Efficient)
    public static long concatenateUsingStringBuilder(int n) {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        // Convert to milliseconds
        return (end - start) / 1000000;
    }

    // Concatenation using StringBuffer - Thread-Safe)
    public static long concatenateUsingStringBuffer(int n) {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        // Convert to milliseconds
        return (end - start) / 1000000;
    }
}
