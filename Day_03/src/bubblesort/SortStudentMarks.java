package bubblesort;

public class SortStudentMarks {

    // Method to implement Bubble sort to sort marks
    public int[] sortMarks(int [] marks){
        int temp;
        for(int i = 0; i<marks.length-1; i++){
           for(int j = 0; j<marks.length-i-1; j++){
               if (marks[j]> marks[j+1]){
                   temp = marks[j+1];
                   marks[j+1] = marks[j];
                   marks[j] = temp;
               }
           }
        }
        return marks;
    }
}
