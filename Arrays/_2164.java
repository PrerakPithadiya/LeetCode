package Arrays;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class _2164 {
    public static void main(String[] args) {
        int[] arr = {36, 45, 32, 31, 15, 41, 9, 46, 36, 6, 15, 16, 33, 26, 27, 31, 44, 34};
        System.out.println(Arrays.toString(sortEvenOdd(arr)));
    }

    public static int[] sortEvenOdd(int[] arr) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 1) {
                odd.add(arr[i]);
            } else {
                even.add(arr[i]);
            }
        }
        Collections.sort(even);
        odd.sort(Collections.reverseOrder());
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 1) {
                arr[i] = odd.get(y++);
            } else {
                arr[i] = even.get(x++);
            }
        }
        return arr;
    }
}