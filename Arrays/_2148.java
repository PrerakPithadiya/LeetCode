package Arrays;

import java.util.Arrays;

public class _2148 {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 3, 3, 90};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (isSmaller(arr, arr[i], 0, i - 1)) {
                if (isGreater(arr, arr[i], i + 1, n - 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isSmaller(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                return true;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean isGreater(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}