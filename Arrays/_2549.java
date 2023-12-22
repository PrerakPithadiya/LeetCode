package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class _2549 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(distinctIntegers(n));
    }

    public static int distinctIntegers(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        for (int i = 0; i < list.size(); i++) {
            addNumbers(list, list.get(i));
        }
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }

    public static void addNumbers(List<Integer> list, int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                list.add(i);
            }
        }
    }
}