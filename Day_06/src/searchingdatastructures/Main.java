package searchingdatastructures;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int dataSize = 1000000;
        int searchKey = dataSize - 1;

        // Generate dataset
        int[] array = new int[dataSize];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < dataSize; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        System.out.println("Comparing Array, HashSet, and TreeSet Search for N = " + dataSize);

        // Measure Array Search Time
        long startArray = System.nanoTime();
        boolean foundArray = SearchingComparison.searchInArray(array, searchKey);
        long endArray = System.nanoTime();
        double arrayTime = (endArray - startArray) / 1_000_000.0;

        // Measure HashSet Search Time
        long startHashSet = System.nanoTime();
        boolean foundHashSet = SearchingComparison.searchInHashSet(hashSet, searchKey);
        long endHashSet = System.nanoTime();
        double hashSetTime = (endHashSet - startHashSet) / 1000000.0;

        // Measure TreeSet Search Time
        long startTreeSet = System.nanoTime();
        boolean foundTreeSet = SearchingComparison.searchInTreeSet(treeSet, searchKey);
        long endTreeSet = System.nanoTime();
        double treeSetTime = (endTreeSet - startTreeSet) / 1000000.0;

        // Display Results
        System.out.println("Array Search: Found = " + foundArray + " | Time: " + arrayTime + " ms");
        System.out.println("HashSet Search: Found = " + foundHashSet + " | Time: " + hashSetTime + " ms");
        System.out.println("TreeSet Search: Found = " + foundTreeSet + " | Time: " + treeSetTime + " ms");
    }
}
