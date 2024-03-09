package Strings;

import java.lang.StringBuilder;

public class _1844 {
    public static void main(String[] args) {
        String str = "a1b2c3d4e";
        System.out.println(replaceDigits(str));
    }

    public static String replaceDigits(String str) {
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for (int i = 1; i < n; i += 2) {
            char ch = str.charAt(i - 1);
            int digit = str.charAt(i) - 48;
            sb.setCharAt(i, shift(ch, digit));
        }
        return sb.toString();
    }

    public static char shift(char ch, int digit) {
        return (char) (ch + digit);
    }
}
