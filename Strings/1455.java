class Solution {
    public int isPrefixOfWord(String str, String searchWord) {
        int n = str.length(), words = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words++;
                if (sb.toString().startsWith(searchWord)) {
                    return words;
                }
                sb.delete(0, sb.length());
            } else {
                sb.append(ch);
            }
        }
        words++;
        if (sb.toString().startsWith(searchWord)) {
            return words;
        }
        return -1;
    }
}
