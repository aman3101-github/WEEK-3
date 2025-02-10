package hashmap.zerosumsubarrays;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 8, -6, 4, 1, 0, 1, -2, -6, -2};
        List<int[]> subarrays = FindZeroSumSubarrays.findZeroSumSubarrays(nums);

        for (int[] subarray : subarrays) {
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
