class Solution {
    public String capitalizeTitle(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String s = sb.toString();
                s = s.toLowerCase();
                sb.delete(0, sb.length());
                sb.append(s);
                if (sb.length() > 2) {
                    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                }
                ans.append(sb).append(" ");
                sb.delete(0, sb.length());
            } else {
                sb.append(ch);
            }
        }
        String s = sb.toString();
        s = s.toLowerCase();
        sb.delete(0, sb.length());
        sb.append(s);
        if (sb.length() > 2) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }
        ans.append(sb);
        return ans.toString();
    }
}
