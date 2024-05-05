class Solution {
    public boolean checkAlmostEquivalent(String str1, String str2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        calcFrequency(freq1, str1);
        calcFrequency(freq2, str2);
        for (int i = 0; i < 26; i++) {
            int diff = freq1[i] - freq2[i];
            diff = (diff < 0) ? diff * -1 : diff;
            if (diff > 3) {
                return false;
            }
        }
        return true;
    }

    public static void calcFrequency(int[] freq, String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch - 97]++;
        }
    }
}
