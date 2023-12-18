package Arrays;

import java.util.Arrays;

public class _2903 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int ind = 2;
        int val = 4;
        System.out.println(Arrays.toString(findIndices(arr, ind, val)));
    }

    public static int[] findIndices(int[] arr, int indDiff, int valDiff) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean con1 = Math.abs(i - j) >= indDiff;
                boolean con2 = Math.abs(arr[i] - arr[j]) >= valDiff;
                if (con1 && con2) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}