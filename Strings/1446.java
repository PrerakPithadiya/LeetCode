class Solution {
    public int maxPower(String s) {
        int n = s.length(), maxLen = 0;
        for (int i = 0; i < n; i++) {
            int len = 1;
            while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                len++;
                i++;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
