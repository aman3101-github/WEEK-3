package binarysearch.peakelement;

public class PeakElement {

        // Method to find a peak element using Binary Search
        public int findPeakElement(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                // If mid-element is less than next element, peak is in right half
                if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    // Otherwise, peak is in left half or mid itself
                    right = mid;
                }
            }
            // 'left' is the index of a peak element
            return left;
        }
    }


