package Strings;

public class _2710 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(removeTrailingZeros(str));
    }

    public static String removeTrailingZeros(String str) {
        int n = str.length(), i = n - 1;
        for (; i >= 0; i--) {
            if (str.charAt(i) != '0') {
                break;
            }
        }
        if (i == -1) {
            return str;
        }
        return str.substring(0, i + 1);
    }
}
