class Solution {
    public String toGoatLatin(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        StringBuilder other = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (isVowel(sb.charAt(0))) {
                    sb.append(sb.charAt(0));
                    sb.deleteCharAt(0);
                }
                other.append("a");
                sb.append("ma").append(other).append(" ");
                ans.append(sb);
                sb.delete(0, sb.length());
            } else {
                sb.append(ch);
            }
        }
        if (isVowel(sb.charAt(0))) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }
        other.append("a");
        sb.append("ma").append(other);
        ans.append(sb);
        return ans.toString();
    }

    public static boolean isVowel(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }
}
