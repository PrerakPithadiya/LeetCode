package Strings;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                list.add(sb.toString());
                sb.delete(0, sb.length());
            } else {
                sb.append(ch);
            }
        }
        list.add(sb.toString());
        sb.delete(0, sb.length());
        for (String str : list) {
            if (canType(str, brokenLetters)) {
                count++;
            }
        }
        return count;
    }

    public static boolean canType(String word, String brokenLetters) {
        for (int i = 0; i < brokenLetters.length(); i++) {
            if (word.contains(brokenLetters.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }
}