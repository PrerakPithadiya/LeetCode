class Solution {
    public int[] numberOfLines(int[] widths, String str) {
        int lines = 1, pixels = 0, n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (pixels + widths[ch - 97] <= 100) {
                pixels += widths[ch - 97];
            } else {
                lines++;
                pixels = widths[ch - 97];
            }
        }
        return new int[]{lines, pixels};
    }
}
