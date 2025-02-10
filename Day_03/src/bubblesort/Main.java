package bubblesort;

public class Main {
    public static void main(String[] args) {
        // Student marks in array
        int [] marks = {95, 84, 91, 87, 92, 84, 80, 96};

        // instance of class
        SortStudentMarks marksObject = new SortStudentMarks();

        // Method calling to sort marks
        int [] sortedMarks = marksObject.sortMarks(marks);

        // Displaying the results
        for (int sortedMark : sortedMarks) {
            System.out.print(sortedMark + " ");
        }
        }
    }

