package hashmap.pairwithgivensum;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] nums, int target) {
        // Set to store numbers we've seen so far
        Set<Integer> seenNumbers = new HashSet<>();

        // Use a traditional for loop instead of enhanced for loop
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Check if (target - num) exists in the set
            if (seenNumbers.contains(target - num)) {
                return true;  // Pair found
            }

            // Add the current number to the set
            seenNumbers.add(num);
        }

        // Return false if no pair is found
        return false;
    }
}
