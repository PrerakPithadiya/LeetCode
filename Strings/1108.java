package Strings;

class _1108 {
    public static void main(String[] args) {
        String str = "255.100.50.0";
        System.out.println(defangIPAddress(str));
    }

    public static String defangIPAddress(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
