class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        StringBuilder sb = new StringBuilder(chars);
        for (String str : words) {
            if (canBeFormed(str, sb)) {
                sum += str.length();
            }
            sb.delete(0, sb.length());
            sb.append(chars);
        }
        return sum;
    }

    public static boolean canBeFormed(String str, StringBuilder sb) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ind = sb.indexOf(ch + "");
            if (ind != -1) {
                sb.deleteCharAt(ind);
            } else {
                return false;
            }
        }
        return true;
    }
}
