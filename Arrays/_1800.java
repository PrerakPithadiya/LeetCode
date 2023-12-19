package Arrays;

public class _1800 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 10, 1, 8, 9, 9, 8, 9};
        System.out.println(maxAscendingSum(arr));
    }

    public static int maxAscendingSum(int[] arr) {
        int n = arr.length;
        if (isAscending(arr, 0, n - 1)) {
            return subArraySum(arr, 0, n - 1);
        }
        int sum, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isAscending(arr, i, j)) {
                    sum = subArraySum(arr, i, j);
                    max = Math.max(max, sum);
                } else {
                    break;
                }
            }
        }
        return max;
    }

    public static boolean isAscending(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int subArraySum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}