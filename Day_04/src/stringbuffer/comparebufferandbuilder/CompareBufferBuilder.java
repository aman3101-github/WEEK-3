package stringbuffer.comparebufferandbuilder;

public class CompareBufferBuilder {

        // Method to measure time using StringBuffer
        public long measureConcatenationTimeUsingStringBuffer(String text, int iterations) {
            long startTime = System.nanoTime();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                stringBuffer.append(text);
            }
            long endTime = System.nanoTime();
            return endTime - startTime;
        }

        // Method to measure time using StringBuilder
        public long measureConcatenationTimeUsingStringBuilder(String text, int iterations) {
            long startTime = System.nanoTime();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                stringBuilder.append(text);
            }
            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }

