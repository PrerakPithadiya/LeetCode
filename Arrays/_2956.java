package Arrays;

import java.util.Arrays;

public class _2956 {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 3, 1};
        int[] arr2 = {2, 2, 5, 2, 3, 6};
        System.out.println(Arrays.toString(findIntersectionValues(arr1, arr2)));
    }

    public static int[] findIntersectionValues(int[] arr1, int[] arr2) {
        int count1 = 0, count2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int el : arr1) {
            if (isPresent(arr2, el)) {
                count1++;
            }
        }
        for (int el : arr2) {
            if (isPresent(arr1, el)) {
                count2++;
            }
        }
        return new int[]{count1, count2};
    }

    public static boolean isPresent(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}