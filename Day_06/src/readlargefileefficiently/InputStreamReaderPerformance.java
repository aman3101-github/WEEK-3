package readlargefileefficiently;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class InputStreamReaderPerformance {
    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while (reader.readLine() != null) {
                // Read line by line (efficient for large files)
            }
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
    }
}
