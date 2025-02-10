package hashmap.zerosumsubarrays;

import java.util.*;

public class FindZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(Arrays.copyOfRange(nums, start + 1, i + 1));
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }
}

