package countingsort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array of student ages
        int[] studentAges = {11, 18, 16, 17, 15, 14};
        System.out.println("Original Ages: " + Arrays.toString(studentAges));

        // Creating the instance of the class
        SortByAge sortByAge = new SortByAge();

        // Calling the method to sort the students by age
        sortByAge.countingSort(studentAges, 18);

        // Display the sorted students by age
        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));
    }
}
