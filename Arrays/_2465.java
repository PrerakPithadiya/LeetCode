package Arrays;

import java.util.Set;
import java.util.HashSet;

public class _2465 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4};
        System.out.println(distinctAverages(arr));
    }

    public static int distinctAverages(int[] arr) {
        int n = arr.length;
        Set<Double> set = new HashSet<>();
        while (n != 0) {
            int[] a = maxAndMin(arr);
            set.add((a[0] + a[1]) / 2.0);
            n -= 2;
        }
        return set.size();
    }

    public static int[] maxAndMin(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxIndex = -1, minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                if (max < arr[i]) {
                    max = arr[i];
                    maxIndex = i;
                }
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
        }
        arr[maxIndex] = arr[minIndex] = -1;
        return new int[]{max, min};
    }
}