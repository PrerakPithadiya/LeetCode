package Arrays;

public class _1287 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        int n = arr.length, more = (int) Math.floor(n * 0.25f);
        if (n == 1) {
            return arr[0];
        }
        for (int i = 0; i < n - 1; i++) {
            int first = firstOccurrence(arr, arr[i]);
            int last = lastOccurrence(arr, arr[i]);
            int freq = last - first + 1;
            if (freq > more) {
                return arr[i];
            }
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return 0;
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, firstOccurrence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                firstOccurrence = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, lastOccurrence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                lastOccurrence = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastOccurrence;
    }
}