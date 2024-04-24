package Strings;

public class _1876 {
    public static void main(String[] args) {
        String str = "aababcabc";
        System.out.println(countGoodSubstrings(str));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if ((s.charAt(i) != s.charAt(i + 1)) &&
                    (s.charAt(i + 1) != s.charAt(i + 2)) &&
                    (s.charAt(i) != s.charAt(i + 2))) {
                count++;
            }
        }
        return count;
    }
}
