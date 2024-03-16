package Strings;

import java.util.List;
import java.util.ArrayList;

public class _2351 {
    public static void main(String[] args) {
        String str = "abccbaacz";
        System.out.println(repeatedCharacter(str));
    }

    public static char repeatedCharacter(String str) {
        List<List<Integer>> list = new ArrayList<>(26);
        char ans = 'a';
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            list.get(ch - 97).add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() >= 2) {
                if (min > list.get(i).get(1)) {
                    min = list.get(i).get(1);
                    ans = (char) (i + 97);
                }
            }
        }
        return ans;
    }
}