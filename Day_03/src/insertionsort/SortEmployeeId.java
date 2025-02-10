package insertionsort;

public class SortEmployeeId {

        public int [] sortEmployeeId(int[] empId) {
            int n = empId.length;

            for (int i = 1; i < n; i++) {
                // Current element to insert
                int key = empId[i];
                int j = i - 1;

                // Shift larger elements to the right
                while (j >= 0 && empId[j] > key) {
                    empId[j + 1] = empId[j];
                    j--;
                }

                // Insert key at the correct position
                empId[j + 1] = key;
            }
            return empId;
        }

    }
