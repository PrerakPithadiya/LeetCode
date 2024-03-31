package Strings;

public class _2062 {
    public static void main(String[] args) {
        String str = "aeiouu";
        System.out.println(countVowelSubstrings(str));
    }

    public static int countVowelSubstrings(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 4; j < n; j++) {
                int res = isVowelString(str.substring(i, j + 1), "aeiou");
                if (res < 0) {
                    break;
                } else if (res > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int isVowelString(String str, String vowels) {
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.charAt(i))) {
                return -1;
            }
        }
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 97]++;
        }
        for (int i = 0; i < 5; i++) {
            if (freq[vowels.charAt(i) - 97] == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}