class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            freq[ch - 48]++;
        }
        for (int i = 0; i < num.length(); i++) {
            int d1 = freq[i];
            int d2 = num.charAt(i) - 48;
            if (d1 != d2) {
                return false;
            }
        }
        return true;
    }
}
