import java.util.Arrays;

public class _2460 {
    public static void main(String[] args) {
        int arr[] = {847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }

    public static int[] applyOperations(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
        for (int i = k; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}