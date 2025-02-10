package readlargefileefficiently;

import java.io.File;

public class Main {
    // Path to a 500MB file
    private static final String FILE_PATH = "largefile.txt";

    public static void comparePerformance(String filePath) {
        System.out.println("\nReading File: " + filePath);

        // Measure FileReader Performance
        long start = System.nanoTime();
        FileReaderPerformance.readFile(filePath);
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1000000.0 + " ms");

        // Measure InputStreamReader Performance
        start = System.nanoTime();
        InputStreamReaderPerformance.readFile(filePath);
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1000000.0 + " ms");
    }

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        if (file.exists()) {
            comparePerformance(FILE_PATH);
        } else {
            System.out.println("File not found: " + FILE_PATH);
        }
    }
}
