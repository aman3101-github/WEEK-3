package fibonaccicomputation;

public class Main {

    public static void main(String[] args) {
        int n = 30; // Adjust N to test different cases

        System.out.println("Comparing Recursive vs Iterative Fibonacci for N = " + n);

        // Measure Recursive Time
        long startRecursive = System.nanoTime();
        int recursiveResult = FibonacciComputation.fibonacciRecursive(n);
        long endRecursive = System.nanoTime();
        double recursiveTime = (endRecursive - startRecursive) / 1_000_000.0;

        // Measure Iterative Time
        long startIterative = System.nanoTime();
        int iterativeResult = FibonacciComputation.fibonacciIterative(n);
        long endIterative = System.nanoTime();
        double iterativeTime = (endIterative - startIterative) / 1_000_000.0;

        // Display Results
        System.out.println("Recursive Result: " + recursiveResult + " | Time: " + recursiveTime + " ms");
        System.out.println("Iterative Result: " + iterativeResult + " | Time: " + iterativeTime + " ms");

        // Warning for large N in recursive approach
        if (n >= 40) {
            System.out.println("Warning: Recursive approach is impractical for N >= 40 due to exponential time complexity.");
        }
    }
}
