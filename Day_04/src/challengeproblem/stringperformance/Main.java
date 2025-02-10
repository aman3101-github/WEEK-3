package challengeproblem.stringperformance;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Compare StringBuilder vs StringBuffer
        CompareStringPerformance.compareStringBuilders();

        // Large file path (Modify as needed)
        String filePath = "file.txt";

        // Compare FileReader vs InputStreamReader
        CompareStringPerformance.compareFileReaders(filePath);
    }
}
