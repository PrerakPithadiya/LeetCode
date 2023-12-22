package Arrays;

public class _1539 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        boolean[] freq = new boolean[1000001];
        for (int element : arr) {
            freq[element] = true;
        }
        int count = 0;
        for (int i = 1; i <= 10001; i++) {
            if (!freq[i]) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return 0;
    }
}