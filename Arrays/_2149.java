package Arrays;

import java.util.Arrays;

public class _2149 {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length, x = 0, y = 1;
        int[] ans = new int[n];
        for (int element : arr) {
            if (element > 0) {
                ans[x] = element;
                x += 2;
            } else {
                ans[y] = element;
                y += 2;
            }
        }
        return ans;
    }
}
