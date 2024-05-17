class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] pos = new int[26];
        int n1 = s.length(), n2 = t.length(), sum = 0;

        for (int i = 0; i < n2; i++) {
            char ch = t.charAt(i);
            pos[ch - 97] = i;
        }

        for (int i = 0; i < n1; i++) {
            char ch = s.charAt(i);
            sum += Math.abs(i - pos[ch - 97]);
        }

        return sum;
    }
}
