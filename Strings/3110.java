package Strings;

class _3110 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(calcScore(str));
    }

    public static int calcScore(String str) {
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int ascii1 = str.charAt(i);
            int ascii2 = str.charAt(i + 1);
            sum = sum + Math.abs(ascii1 - ascii2);
        }
        return sum;
    }
}