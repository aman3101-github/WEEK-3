package countingsort;

public class SortByAge {
    // Method to sort students by age
    public void countingSort(int[] ages, int maxAge) {
        int[] count = new int[maxAge + 1];

        for (int age : ages) {
            count[age]++;
        }

        int index = 0;
        for (int i = 10; i <= maxAge; i++) {
            while (count[i] > 0) {
                ages[index++] = i;
                count[i]--;
            }
        }
    }
}
