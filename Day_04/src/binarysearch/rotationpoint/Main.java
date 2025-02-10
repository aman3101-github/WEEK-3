package binarysearch.rotationpoint;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of RotationPoint class
        RotationPoint search = new RotationPoint();

        // Example rotated sorted array
        int[] arr = {27, 49, 11, 42, 5, 81, 63, 25};

        // Call method to find the rotation point index
        int rotationIndex = search.findRotationPoint(arr);

        // Display the result
        System.out.println("Rotation Point Index: " + rotationIndex);
        System.out.println("Smallest Element: " + arr[rotationIndex]);
    }
}
