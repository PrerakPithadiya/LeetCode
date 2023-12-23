package Arrays;

import java.util.Map;
import java.util.HashMap;

public class _2190 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 3};
        int num = 2;
        System.out.println(mostFrequent(arr, num));
    }

    public static int mostFrequent(int[] arr, int key) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] == key) {
                int target = arr[i + 1];
                if (map.containsKey(target)) {
                    map.put(target, map.get(target) + 1);
                } else {
                    map.put(target, 1);
                }
            }
        }
        int max = Integer.MIN_VALUE, ans = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (max < e.getValue()) {
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }
}