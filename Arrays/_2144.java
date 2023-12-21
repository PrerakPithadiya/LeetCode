package Arrays;

import java.util.Arrays;

public class _2144 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 9, 2, 2};
        System.out.println(minimumCost(arr));
    }

    public static int minimumCost(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[n - 1];
        }
        if (n == 2) {
            return arr[n - 2] + arr[n - 1];
        }
        int sum = 0;
        Arrays.sort(arr);
        while (arr[n - 1] != -1) {
            sum += arr[n - 2] + arr[n - 1];
            arr[n - 3] = arr[n - 2] = arr[n - 1] = -1;
            Arrays.sort(arr);
            if (arr[n - 1] == -1) {
                return sum;
            } else if (arr[n - 2] == -1) {
                sum += arr[n - 1];
                return sum;
            } else if (arr[n - 3] == -1) {
                sum += (arr[n - 1] + arr[n - 2]);
                return sum;
            }
        }
        return sum;
    }
}