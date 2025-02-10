package searchingdatastructures;
import java.util.*;

public class SearchingComparison {

    // Linear Search in Array (O(N))
    public static boolean searchInArray(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    // Search in HashSet (O(1) on average)
    public static boolean searchInHashSet(Set<Integer> hashSet, int key) {
        return hashSet.contains(key);
    }

    // Search in TreeSet (O(log N))
    public static boolean searchInTreeSet(Set<Integer> treeSet, int key) {
        return treeSet.contains(key);
    }
}
