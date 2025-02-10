package stringconcatenation;

public class Main {
 public static void main(String[] args) {
            int N = 1_000_000; // Number of concatenations

            System.out.println("Comparing String, StringBuilder, and StringBuffer Performance for N = " + N);

            // Measure String Performance
            System.out.println("Running String concatenation");
            long stringTime = Concatenation.concatenateUsingString(N);
            System.out.println("String Time: " + stringTime + " ms");

            // Measure StringBuilder Performance
            System.out.println("Running StringBuilder concatenation");
            long stringBuilderTime = Concatenation.concatenateUsingStringBuilder(N);
            System.out.println("StringBuilder Time: " + stringBuilderTime + " ms");

            // Measure StringBuffer Performance
            System.out.println("Running StringBuffer concatenation");
            long stringBufferTime = Concatenation.concatenateUsingStringBuffer(N);
            System.out.println("StringBuffer Time: " + stringBufferTime + " ms");
        }
    }
