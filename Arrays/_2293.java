package Arrays;

import java.util.List;
import java.util.ArrayList;

public class _2293 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(minMaxGame(arr));
    }

    public static int minMaxGame(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        List<Integer> list = new ArrayList<>();
        makeAList(list, arr);
        while (list.size() > 1) {
            playGame(list);
        }
        return list.get(0);
    }

    public static void playGame(List<Integer> list) {
        int ans, n = list.size() / 2, x = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans = Math.min(list.get(2 * i - x), list.get(2 * i + 1 - x));
            } else {
                ans = Math.max(list.get(2 * i - x), list.get(2 * i + 1 - x));
            }
            list.remove(2 * i - x);
            list.remove(2 * i - x);
            list.add(2 * i - x, ans);
            x++;
        }
    }

    public static void makeAList(List<Integer> list, int[] arr) {
        for (int element : arr) {
            list.add(element);
        }
    }
}