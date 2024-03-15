package Arrays;

import java.util.Arrays;

public class _238 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pref = calcPrefix(arr, n);
        int[] suff = calcSuffix(arr, n);
        arr[0] = suff[1];
        for (int i = 1; i < n - 1; i++) {
            arr[i] = pref[i - 1] * suff[i + 1];
        }
        arr[n - 1] = pref[n - 2];
        return arr;
    }

    public static int[] calcPrefix(int[] arr, int n) {
        int[] pref = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
            pref[i] = product;
        }
        return pref;
    }

    public static int[] calcSuffix(int[] arr, int n) {
        int[] suff = new int[n];
        int product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= arr[i];
            suff[i] = product;
        }
        return suff;
    }
}
