class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length(), end = n;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                String str = s.substring(i + 1, end);
                sb.append(str).append(" ");
                while (s.charAt(i - 1) == ' ') {
                    i--;
                }
                end = i;
            }
        }
        sb.append(s.substring(0, end));
        return sb.toString();
    }
}
