package Strings;

import java.lang.StringBuilder;

public class _2000 {
    public static void main(String[] args) {
        String str = "abcd";
        char ch = 'z';
        System.out.println(reversePrefix(str, ch));
    }

    public static String reversePrefix(String str, char ch) {
        int end = str.indexOf(ch), n = str.length();
        if (end == -1) {
            return str;
        }
        String part1 = str.substring(0, end + 1);
        String part2 = str.substring(end + 1, n);
        StringBuilder sb = new StringBuilder(part1);
        part1 = sb.reverse().toString();
        return part1 + part2;
    }
}
