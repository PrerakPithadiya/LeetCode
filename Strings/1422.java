class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int i = 0, j = n - 1, count1 = 0, count2 = 0, sum = 0, maxSum = Integer.MIN_VALUE;
        int[] pref = new int[n];
        int[] suff = new int[n];
        while (i < n) {
            // prefix
            if (s.charAt(i) == '0') {
                count1++;
            }
            pref[i] = count1;

            // suffix
            if (s.charAt(j) == '1') {
                count2++;
            }
            suff[j] = count2;

            i++;
            j--;
        }

        for (i = 0; i < n - 1; i++) {
            sum = pref[i] + suff[i + 1];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
