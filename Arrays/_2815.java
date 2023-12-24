package Arrays;

public class _2815 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int n = arr.length, max = -1, sum, dig1, dig2;
        for (int i = 0; i < n - 1; i++) {
            dig1 = maxDigit(arr[i]);
            for (int j = i + 1; j < n; j++) {
                dig2 = maxDigit(arr[j]);
                if (dig1 == dig2) {
                    sum = arr[i] + arr[j];
                    max = Math.max(sum, max);
                }
            }
        }
        return max;
    }

    public static int maxDigit(int n) {
        int max = 0, r;
        while (n != 0) {
            r = n % 10;
            max = Math.max(max, r);
            n /= 10;
        }
        return max;
    }
}