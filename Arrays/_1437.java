package Arrays;

public class _1437 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1, 0, 1};
        int num = 2;
        System.out.println(kLengthApart(arr, num));
    }

    public static boolean kLengthApart(int[] arr, int k) {
        int n = arr.length, left, right = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                left = right;
                right = i;
                if (left >= 0) {
                    if (right - left - 1 < k) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}