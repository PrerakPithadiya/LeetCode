package Arrays;

import java.util.Arrays;

public class _1046 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int ans = lastStoneWeight(arr);
        System.out.printf("%d\n", ans);
    }

    public static int lastStoneWeight(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        while (n > 1) {
            Arrays.sort(arr);
            int x = arr[arr.length - 2];
            int y = arr[arr.length - 1];
            if (x == y) {
                arr[arr.length - 2] = -1;
                arr[arr.length - 1] = -1;
                n -= 2;
            } else {
                arr[arr.length - 2] = -1;
                arr[arr.length - 1] = y - x;
                n -= 1;
            }
        }
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                return arr[i];
            }
        }
        return 0;
    }
}