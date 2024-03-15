package Strings;

public class _791 {
    public static void main(String[] args) {
        String order = "bcafg";
        String s = "abcd";
        System.out.println(customSortString(order, s));
    }

    public static String customSortString(String order, String s) {
        int n = s.length();
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch - 97]++;
        }
        n = order.length();
        for (int i = 0; i < n; i++) {
            char ch = order.charAt(i);
            while (freq[ch - 97] != 0) {
                sb.append(ch);
                freq[ch - 97]--;
            }
        }
        n = 26;
        for (int i = 0; i < n; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 97);
                while (freq[i] != 0) {
                    sb.append(ch);
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
