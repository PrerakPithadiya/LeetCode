package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class _2451 {
    public static void main(String[] args) {
        String[] arr = new String[]{"aaa", "bob", "ccc", "ddd"};
        System.out.println(oddString(arr));
    }

    public static String oddString(String[] words) {
        int n = words.length;
        List<String> list = new ArrayList<>();
        for (String word : words) {
            getDifferenceArray(word, list);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                return words[list.indexOf(e.getKey())];
            }
        }
        return "";
    }

    public static void getDifferenceArray(String str, List<String> list) {
        int n = str.length();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            arr[i] = (ch2 - 97) - (ch1 - 97);
        }
        list.add(Arrays.toString(arr));
    }
}