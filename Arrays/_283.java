package Arrays;

import java.util.Arrays;

public class _283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length, k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
        if (k == 0) {
            return;
        }
        for (int i = k; i < n; i++) {
            arr[i] = 0;
        }
    }
}