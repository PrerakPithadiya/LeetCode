class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length(), len;
        if (n % k == 0) {
            len = n / k;
        } else {
            len = n / k + 1;
        }
        String[] arr = new String[len];
        int m = 0, i;
        for (i = 0; i <= n - k; i += k) {
            arr[m++] = s.substring(i, i + k);
        }
        if (i < n) {
            StringBuilder temp = new StringBuilder(s.substring(i, n));
            int opr = k - (n - i);
            for (int j = 1; j <= opr; j++) {
                temp.append(fill);
            }
            arr[m] = temp.toString();
        }   
        return arr;
    }
}
