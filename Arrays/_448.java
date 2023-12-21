package Arrays;

import java.util.List;
import java.util.ArrayList;

public class _448 {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int[] freq = new int[n + 1];
        for (int element : arr) {
            freq[element]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}