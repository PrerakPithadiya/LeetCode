package Arrays;

public class _2908 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 4, 5};
        System.out.println(minimumSum(arr));
    }

    public static int minimumSum(int[] arr) {
        int n = arr.length, sum = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (!(arr[i] < arr[j])) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (arr[j] > arr[k]) {
                        sum = arr[i] + arr[j] + arr[k];
                        if (min > sum) {
                            min = sum;
                        }
                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}