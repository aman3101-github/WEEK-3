package binarysearch.rotationpoint;

public class RotationPoint {

        // Method to find the rotation point in a rotated sorted array
        public int findRotationPoint(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2; // Avoids overflow

                // If mid-element is greater than the rightmost element,
                // the smallest element must be in the right half
                if (arr[mid] > arr[right]) {
                    left = mid + 1;
                } else {
                    // Otherwise, the smallest element is in the left half (including mid)
                    right = mid;
                }
            }
            return left; // 'left' is the index of the smallest element
        }
    }


