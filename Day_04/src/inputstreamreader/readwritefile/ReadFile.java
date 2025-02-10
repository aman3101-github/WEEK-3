package inputstreamreader.readwritefile;
import java.io.*;

public class ReadFile {

    // Method to read user input and write to a file
    public void readAndWriteToFile(String filePath) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("Enter text to write to the file, write exit when done:");

            String line;
            while (true) {
                line = br.readLine();

                // Stop reading input if user types "exit"
                if ("exit".equalsIgnoreCase(line)) {
                    System.out.println("Completed. Check the file: " + filePath);
                    break;
                }

                // Write user input to the file and add a new line
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
