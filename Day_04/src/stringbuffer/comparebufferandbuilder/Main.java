package stringbuffer.comparebufferandbuilder;

public class Main {
    public static void main(String[] args) {
        // String to concatenate
        String text = "java";
        int iterations = 1_000_000;

        // Create an instance of StringBufferVsStringBuilder
        CompareBufferBuilder comparison = new CompareBufferBuilder();

        // Measure time for StringBuffer
        long stringBufferTime = comparison.measureConcatenationTimeUsingStringBuffer(text, iterations);
        System.out.println("StringBuffer Time: " + stringBufferTime + " nanoseconds");

        // Measure time for StringBuilder
        long stringBuilderTime = comparison.measureConcatenationTimeUsingStringBuilder(text, iterations);
        System.out.println("StringBuilder Time: " + stringBuilderTime + " nanoseconds");
    }
}
