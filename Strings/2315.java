class Solution {
    public int countAsterisks(String s) {
        int n = s.length(), count = 0, astr = 0, i = 0;
        while (i < n && s.charAt(i) != '|') {
            if (s.charAt(i) == '*') {
                astr++;
            }
            i++;
        }
        count++;
        i++;
        while (i < n) {
            if (s.charAt(i) == '|') {
                count++;
                if (count % 2 == 0) {
                    i++;
                    while (i < n && s.charAt(i) != '|') {
                        if (s.charAt(i) == '*') {
                            astr++;
                        }
                        i++;
                    }
                    count++;
                }
            }
            i++;
        }
        return astr;
    }
}
