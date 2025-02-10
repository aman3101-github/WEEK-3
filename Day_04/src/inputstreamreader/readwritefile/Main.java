package inputstreamreader.readwritefile;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of UserInputWriter
        ReadFile writer = new ReadFile();

        // Specify the file path to write user input
        String filePath = "input_file.txt";

        // Call method to read input from user and write to file
        writer.readAndWriteToFile(filePath);
    }
}

