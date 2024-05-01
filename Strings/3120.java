class Solution {
    public int numberOfSpecialChars(String str) {
        int count = 0, n = str.length();
        int[] freq = new int[123];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            char upper = (char) (ch - 32);
            if (freq[ch] != 0 && freq[upper] != 0) {
                count++;
            }
        }
        return count;
    }
}
