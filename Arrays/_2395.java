package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class _2395 {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0};
        System.out.println(findSubarrays(arr));
    }

    public static boolean findSubarrays(int[] arr) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            list.add(arr[i] + arr[i + 1]);
            set.add(arr[i] + arr[i + 1]);
        }
        return list.size() != set.size();
    }
}