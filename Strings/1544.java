class Solution {
    public String makeGood(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean con = true;
        while (con) {
            con = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                char ch = sb.charAt(i);
                if ('a' <= ch && ch <= 'z') {
                    if ((char) (ch - 32) == sb.charAt(i + 1)) {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i);
                        i--;
                        con = true;
                    }
                } else {
                    if ((char) (ch + 32) == sb.charAt(i + 1)) {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i);
                        i--;
                        con = true;
                    }
                }
            }
        }
        return sb.toString();
    }
}
