package Arrays;

import java.util.HashMap;
import java.util.Map;

public class _2404 {
    public static void main(String[] args) {
        int[] arr = {29, 47, 21, 41, 13, 37, 25, 7};
        System.out.println(mostFrequentEven(arr));
    }

    public static int mostFrequentEven(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (element % 2 == 0) {
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1);
                } else {
                    map.put(element, 1);
                }
            }
        }
        if (map.isEmpty()) {
            return -1;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (max < e.getValue()) {
                max = e.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == max) {
                if (min > e.getKey()) {
                    min = e.getKey();
                }
            }
        }
        return min;
    }
}