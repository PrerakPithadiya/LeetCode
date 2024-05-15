class Solution {
    public String modifyString(String str) {
        StringBuilder sb = new StringBuilder(str);
		char ch = 'a';
		int n = sb.length();

        if (n == 1 && sb.charAt(0) == '?') {
			while (sb.charAt(0) == ch) {
				ch++;
			}
			sb.setCharAt(0, ch);
			return sb.toString();
		}

		if (sb.charAt(0) == '?') {
			while (sb.charAt(1) == ch) {
				ch++;
			}
			sb.setCharAt(0, ch);
		}

		for (int i = 1; i < n - 1; i++) {
			if (sb.charAt(i) == '?') {
				ch = 'a';
				while (sb.charAt(i - 1) == ch || sb.charAt(i + 1) == ch) {
					ch++;
				}
				sb.setCharAt(i, ch);
			}
		}

		ch = 'a';
		if (sb.charAt(n - 1) == '?') {
			while (sb.charAt(n - 2) == ch) {
				ch++;
			}
			sb.setCharAt(n - 1, ch);
		}

		return sb.toString();
    }
}
