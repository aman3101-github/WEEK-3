package filereader.readfile;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of FileReaderExample
        ReadFile fileReader = new ReadFile();

        // Specify the file path (Change this to an existing file path on your system)
        String filePath = "file.txt";

        // Call method to read and print file content
        fileReader.readFile(filePath);
    }
}
