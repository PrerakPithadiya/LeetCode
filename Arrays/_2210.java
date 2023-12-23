package Arrays;

public class _2210 {
    public static void main(String[] args) {
        int[] arr = {6, 6, 5, 5, 4, 1};
        System.out.println(countHillValley(arr));
    }

    public static int countHillValley(int[] arr) {
        int n = arr.length, k = 0, hills = 0, valleys = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[k++] = arr[i];
            }
        }
        arr[k++] = arr[n - 1];
        for (int i = 1; i < k - 1; i++) {
            int left = leftUniqueElement(arr, i - 1);
            int right = rightUniqueElement(arr, i + 1);
            if (arr[left] < arr[i] && arr[i] > arr[right]) {
                hills++;
            } else if (arr[left] > arr[i] && arr[i] < arr[right]) {
                valleys++;
            }
        }
        return hills + valleys;
    }

    public static int leftUniqueElement(int[] arr, int n) {
        for (int i = n; i >= 0; i--) {
            if (arr[n + 1] != arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int rightUniqueElement(int[] arr, int n) {
        for (int i = n; i < arr.length; i++) {
            if (arr[n - 1] != arr[i]) {
                return i;
            }
        }
        return -1;
    }
}