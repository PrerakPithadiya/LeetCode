class Solution {
    public String largestGoodInteger(String str) {
        int max = -1;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2) && str.charAt(i + 2) == str.charAt(i)) {
                int num = Integer.parseInt(str.substring(i, i + 3));
                if (max < num) {
                    max = num;
                }
            }
        }
        if (max == -1) {
            return "";
        }
        if (max == 0) {
            return "000";
        }
        return max + "";
    }
}
