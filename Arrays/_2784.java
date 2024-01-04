package Arrays;

import java.util.Arrays;

public class _2784 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 1, 2, 1};
        System.out.println(isGood(arr));
    }
    public static boolean isGood(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int n = arr[len - 1];
        if (len != n + 1) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != i) {
                return false;
            }
        }
        if (arr[len - 2] != n || arr[len - 1] != n) {
            return false;
        }
        return true;
    }
}