package heapsort;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] salaries = {50000, 451000, 30000, 70000, 684000};

        System.out.println("Original Salaries: " + Arrays.toString(salaries));

        SortBySalary sortSalary = new SortBySalary();
        sortSalary.heapSort(salaries);

        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}
