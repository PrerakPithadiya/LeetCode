class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder(s);
        StringBuilder digits = new StringBuilder();
        int n = s.length(), n1 = n, n2 = 0, k = 0;
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            if ('0' <= ch && ch <= '9') {
                digits.append(ch);
                n2++;
                letters.deleteCharAt(i);
                i--;
                n1--;
            }
        }
        if (Math.abs(n1 - n2) <= 1) {
            if (n1 > n2) {
                k = 1;
            }
        } else {
            return "";
        }
        n = digits.length();
        for (int i = 0; i < n; i++) {
            letters.insert(k, digits.charAt(i));
            k += 2;
        }
        return letters.toString();
    }
}
