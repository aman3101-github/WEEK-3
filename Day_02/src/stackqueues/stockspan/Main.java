package stackqueues.stockspan;
import stackqueues.stockspan.SpanCalculator;
public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 75, 60, 70, 55, 55, 105};
        int[] span = SpanCalculator.calculateSpan(prices); // Now it works!

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
