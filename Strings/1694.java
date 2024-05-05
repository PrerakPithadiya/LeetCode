class Solution {
    public String reformatNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder ans = new StringBuilder();
        int n, i;
        for (i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ' || ch == '-') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        i = 0;
        n = sb.length();
        while (i < n) {
            if (n - i > 4) {
                ans.append(sb.substring(i, i + 3)).append("-");
                i += 3;
            } else if (n - i == 4) {
                ans.append(sb.substring(i, i + 2)).append("-");
                ans.append(sb.substring(i + 2, i + 4));
                i += 4;
            } else if (n - i == 3) {
                ans.append(sb.substring(i, i + 3));
                i += 3;
            } else {
                ans.append(sb.substring(i, i + 2));
                i += 2;
            }
        }
        return ans.toString();
    }
}
