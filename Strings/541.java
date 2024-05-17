class Solution {
    public String reverseStr(String str, int k) {
        int n = str.length(), i, count = 1;
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		for (i = 0; i + k <= n; i += k) {
			sb.append(str.substring(i, i + k));
			if (count % 2 != 0) {
				sb.reverse();
			}
			ans.append(sb);
			sb.delete(0, sb.length());
			count++;
		}
		if (i < n) {
			sb.append(str.substring(i, n));
			if (count % 2 != 0) {
				sb.reverse();
			}
			ans.append(sb);
		}
		return ans.toString();
    }
}
