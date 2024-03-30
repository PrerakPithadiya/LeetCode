package Arrays;

public class _287 {

    // Method to find a duplicate element in the array
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1]; // Array to store frequency of elements

        // Counting frequency of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Checking for elements with frequency greater than or equal to 2 (duplicates)
        for (int i = 1; i <= n; i++) {
            if (freq[i] >= 2) {
                return i; // Returning the duplicate element
            }
        }

        return 0; // If no duplicate found, return 0
    }
}
