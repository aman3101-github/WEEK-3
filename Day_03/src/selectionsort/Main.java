package selectionsort;
import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            int[] examScores = {95, 90, 86, 78, 88};

            System.out.println("Original Scores: " + Arrays.toString(examScores));

            SortExamScores sortScores = new SortExamScores();
            sortScores.selectionSort(examScores);

            System.out.println("Sorted Scores: " + Arrays.toString(examScores));
        }
    }
