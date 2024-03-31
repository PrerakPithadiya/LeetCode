package Strings;

public class _2278 {
    public static void main(String[] args) {
        String str = "sgawtb";
        char ch = 's';
        System.out.println(percentageLetter(str, ch));
    }

    public static int percentageLetter(String s, char letter) {
        double letterFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                letterFreq++;
            }
        }
        return (int) (letterFreq * 100) / s.length();
    }
}