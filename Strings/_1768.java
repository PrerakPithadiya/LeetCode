package Strings;

import java.lang.StringBuilder;

public class _1768 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "pq";
        System.out.println(mergeAlternately(str1, str2));
    }

    public static String mergeAlternately(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length(), max = (n1 > n2) ? n1 : n2, i = 0;
        StringBuilder sb = new StringBuilder();
        while (max != 0) {
            if (i < n1) {
                sb.append(str1.charAt(i));
            }
            if (i < n2) {
                sb.append(str2.charAt(i));
            }
            i++;
            max--;
        }
        return sb.toString();
    }
}