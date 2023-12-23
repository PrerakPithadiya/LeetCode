package Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _2094 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 0};
        System.out.println(Arrays.toString(findEvenNumbers(arr)));
    }

    public static int[] findEvenNumbers(int[] arr) {
        int n = arr.length, m = 0;
        Set<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    addToAnswer(ts, arr[i], arr[j], arr[k]);
                }
            }
        }
        int[] ans = new int[ts.size()];
        for (int element : ts) {
            ans[m++] = element;
        }
        return ans;
    }

    public static void addToAnswer(Set<Integer> ts, int d1, int d2, int d3) {
        int n;
        n = Integer.parseInt("" + d1 + d2 + d3);
        if (99 < n && n % 2 == 0) {
            ts.add(n);
        }
        n = Integer.parseInt("" + d3 + d1 + d2);
        if (99 < n && n % 2 == 0) {
            ts.add(n);
        }
        n = Integer.parseInt("" + d2 + d3 + d1);
        if (99 < n && n % 2 == 0) {
            ts.add(n);
        }
        n = Integer.parseInt("" + d1 + d3 + d2);
        if (99 < n && n % 2 == 0) {
            ts.add(n);
        }
        n = Integer.parseInt("" + d3 + d2 + d1);
        if (99 < n && n % 2 == 0) {
            ts.add(n);
        }
        n = Integer.parseInt("" + d2 + d1 + d3);
        if (99 < n && n % 2 == 0) {
            ts.add(n);
        }
    }
}