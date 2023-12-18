package Arrays;

public class _2073 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1};
        int k = 0;
        System.out.println(timeRequiredToBuy(arr, k));
    }

    public static int timeRequiredToBuy(int[] arr, int k) {
        int n = arr.length, time = 0;
        while (arr[k] != 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    arr[i]--;
                    time++;
                }
                if (arr[k] == 0) {
                    return time;
                }
            }
        }
        return time;
    }
}