package Arrays;

public class _704 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}