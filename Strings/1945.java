class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 96);
        }
        while (k != 0) {
            long sum = 0;
            for (int i = 0; i < sb.length(); i++) {
                sum += (sb.charAt(i) - 48);
            }
            sb.delete(0, sb.length());
            sb.append(sum);
            k--;
        }
        return Integer.parseInt(sb.toString());
    }
}
