package Arrays;

public class _27 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int num = 2;
        System.out.println(removeElement(arr, num));
    }

    public static int removeElement(int[] arr, int val) {
        int n = arr.length, k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }
}