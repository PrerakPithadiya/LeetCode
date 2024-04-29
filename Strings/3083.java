class Solution {
    public boolean isSubstringPresent(String str) {
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            String s = "" + str.charAt(i + 1) + str.charAt(i);
            if (str.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
