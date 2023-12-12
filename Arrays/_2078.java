public class _2078 {
    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 8, 3};
        System.out.println(maxDistance(arr));
    }

    public static int maxDistance(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j]) {
                    if (max < j - i) {
                        max = j - i;
                    }
                }
            }
        }
        return max;
    }
}