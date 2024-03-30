package Arrays;

import java.util.List;
import java.util.ArrayList;

public class _442 {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        List<Integer> duplicates = new ArrayList<>(); // List to store duplicate elements
        int[] freq = new int[n + 1]; // Array to store frequency of elements

        // Counting frequency of each element
        for (int j : arr) {
            freq[j]++;
        }

        // Checking for elements with frequency 2 (duplicates)
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicates.add(i); // Adding duplicate element to the list
            }
        }

        return duplicates; // Returning list of duplicates
    }
}