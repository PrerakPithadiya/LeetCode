package Arrays;

public class _485 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                int count = 1;
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}