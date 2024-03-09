package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class _1941 {
    public static void main(String[] args) {
        String str = "aaabb";
        System.out.println(areOccurrencesEqual(str));
    }

    public static boolean areOccurrencesEqual(String str) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            set.add(e.getValue());
        }
        return set.size() == 1;
    }
}