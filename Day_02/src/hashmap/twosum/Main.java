package hashmap.twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {20, 1, 11, 15};
        int target = 12;

        int[] result = TwoSum.findTwoSum(nums, target);
        System.out.println("Indices of two numbers: " + Arrays.toString(result));
    }
}

