package Arrays;

public class _647 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(countSubstrings(str));
    }

    public static int countSubstrings(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindromic(str.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindromic(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}