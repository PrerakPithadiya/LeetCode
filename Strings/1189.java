class Solution {
    public int maxNumberOfBalloons(String s) {
        int n = s.length(), count = 0;
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch - 97]++;
        }
        while (freq[1] >= 1 && freq[0] >= 1 && freq[11] >= 2 && freq[14] >= 2 && freq[13] >= 1) {
            freq[1]--;
            freq[0]--;
            freq[11] -= 2;
            freq[14] -= 2;
            freq[13]--;
            count++;
        }
        return count;
    }
}
