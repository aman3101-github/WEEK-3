package challengeproblem.stringperformance;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class CompareStringPerformance {

        // Method to compare StringBuilder vs StringBuffer
        public static void compareStringBuilders() {
            String text = "hello";
            int iterations = 1_000_000;

            // Measure time for StringBuilder
            long startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                sb.append(text);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");

            // Measure time for StringBuffer
            startTime = System.currentTimeMillis();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                sbf.append(text);
            }
            endTime = System.currentTimeMillis();
            System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");
        }

        // Method to compare FileReader vs InputStreamReader
        public static void compareFileReaders(String filePath) {
            // Measure time for FileReader
            long startTime = System.currentTimeMillis();
            int wordCountFR = countWordsUsingFileReader(filePath);
            long endTime = System.currentTimeMillis();
            System.out.println("FileReader Time: " + (endTime - startTime) + " ms, Words: " + wordCountFR);

            // Measure time for InputStreamReader
            startTime = System.currentTimeMillis();
            int wordCountISR = countWordsUsingInputStreamReader(filePath);
            endTime = System.currentTimeMillis();
            System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms, Words: " + wordCountISR);
        }

        // Method to count words using FileReader
        private static int countWordsUsingFileReader(String filePath) {
            int wordCount = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    wordCount += line.split("\\s+").length;
                }
            } catch (IOException e) {
                System.out.println("Error reading file with FileReader: " + e.getMessage());
            }
            return wordCount;
        }

        // Method to count words using InputStreamReader
        private static int countWordsUsingInputStreamReader(String filePath) {
            int wordCount = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    wordCount += line.split("\\s+").length;
                }
            } catch (IOException e) {
                System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
            }
            return wordCount;
        }
    }


