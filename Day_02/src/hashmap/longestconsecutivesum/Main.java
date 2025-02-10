package hashmap.longestconsecutivesum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {200, 125, 200, 142, 30, 201};
        int result = LongestConsecutiveSequence.findLongestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
