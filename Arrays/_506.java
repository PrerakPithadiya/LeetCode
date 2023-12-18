package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class _506 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }

    public static String[] findRelativeRanks(int[] arr) {
        int n = arr.length;
        String[] ans = new String[n];
        List<Integer> list = new ArrayList<>();
        for (int element : arr) {
            list.add(element);
        }
        list.sort(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int pos = findIndex(list, arr[i]) + 1;
            if (pos == 1) {
                ans[i] = "Gold Medal";
            } else if (pos == 2) {
                ans[i] = "Silver Medal";
            } else if (pos == 3) {
                ans[i] = "Bronze Medal";
            } else {
                ans[i] = pos + "";
            }
        }
        return ans;
    }

    public static int findIndex(List<Integer> list, int target) {
        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}