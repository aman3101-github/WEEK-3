package readlargefileefficiently;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderPerformance { // Correct class name
    public static void readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int data;
            while ((data = reader.read()) != -1) {
                // Read character by character (inefficient for large files)
            }
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
    }
}
