package inputstreamreader.bytetocharstream;

public class Main {
    public static void main(String[] args) {

        // Creating an instance of FileByteReader class
        ByteToCharStream reader = new ByteToCharStream();

        // Specify the file path (Change this to an existing file path on your system)
        String filePath = "file.txt";

        // Call method to read file content
        reader.readFile(filePath);
    }
}
