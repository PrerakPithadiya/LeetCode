package Arrays;

import java.util.Arrays;

public class _748 {
    public static void main(String[] args) {
        String str = "1s3 456";
        String[] arr = new String[]{"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord(str, arr));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] licFreq = new int[26];
        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                licFreq[ch - 97]++;
            }
        }
        int[] freq = new int[26];
        int minLength = Integer.MAX_VALUE;
        String ans = "";
        for (String str : words) {
            if (isValidAnswer(licensePlate, licFreq, str, freq)) {
                if (minLength > str.length()) {
                    minLength = str.length();
                    ans = str;
                }
            }
        }
        return ans;
    }

    public static boolean isValidAnswer(String licPlate, int[] licFreq, String str, int[] freq) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 97]++;
        }
        for (int i = 0; i < licPlate.length(); i++) {
            char ch = licPlate.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                if (licFreq[ch - 97] != freq[ch - 97]) {
                    Arrays.fill(freq, 0);
                    return false;
                }
            }
        }
        Arrays.fill(freq, 0);
        return true;
    }
}