class Solution {
    public boolean checkString(String str) {
        int lastOccurrence = -1;
        int firstOccurrence = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'a') {
                lastOccurrence = i;
                break;
            }
        }
        if (lastOccurrence == -1) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b') {
                firstOccurrence = i;
                break;
            }
        }
        if (firstOccurrence == -1) {
            return true;
        }
        return lastOccurrence < firstOccurrence;
    }
}
