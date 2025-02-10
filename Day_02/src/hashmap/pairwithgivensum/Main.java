package hashmap.pairwithgivensum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        int target = 17;

        boolean result = PairWithGivenSum.hasPairWithSum(nums, target);
        System.out.println("Pair with sum exists: " + result);
    }
}
