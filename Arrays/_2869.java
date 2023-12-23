package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class _2869 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 5, 4, 2));
        int k = 5;
        System.out.println(minOperations(list, k));
    }

    public static int minOperations(List<Integer> arr, int k) {
        int m = arr.size() - 1, steps = 0;
        boolean[] freq = new boolean[51];
        while (!isContainsElements(freq, k)) {
            freq[arr.get(m--)] = true;
            steps++;
        }
        return steps;
    }

    public static boolean isContainsElements(boolean[] freq, int k) {
        for (int i = 1; i <= k; i++) {
            if (!freq[i]) {
                return false;
            }
        }
        return true;
    }
}