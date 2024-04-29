class Solution {
    public String digitSum(String str, int k) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder digitSum = new StringBuilder();
        while (sb.length() > k) {
            int n = sb.length(), i;
            for (i = 0; i < n; i += k) {
                if (i + k <= n) {
                    digitSum.append(calcDigitSum(sb.substring(i, i + k)));
                }
            }
            if (i > n && i - k < n) {
                digitSum.append(calcDigitSum(sb.substring(i - k, n)));
            }
            sb.delete(0, sb.length());
            sb.append(digitSum);
            digitSum.delete(0, digitSum.length());
        }
        return sb.toString();
    }

    public static int calcDigitSum(String str) {
        int n = str.length(), sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            sum += (ch - 48);
        }
        return sum;
    }
}
