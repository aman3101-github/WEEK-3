package stackqueues.slidingwindow;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = SlidingWindowMax.maxSlidingWindow(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
