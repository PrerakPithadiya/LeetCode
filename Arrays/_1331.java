package Arrays;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class _1331 {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
//    [5, 3, 4, 2, 8, 6, 7, 1, 3]

    public static int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        addToAnother(ts, arr);
        List<Integer> list = new ArrayList<>(ts);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = findIndex(list, arr[i]) + 1;
        }
        return arr;
    }

    public static int findIndex(List<Integer> list, int target) {
        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void addToAnother(TreeSet<Integer> ts, int[] arr) {
        for (int element : arr) {
            ts.add(element);
        }
    }
}