class Solution {
    public int maxLengthBetweenEqualCharacters(String str) {
        int max = -1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (max < j - i - 1) {
                        max = j - i - 1;
                    }
                }
            }
        }
        return max;
    }
}
