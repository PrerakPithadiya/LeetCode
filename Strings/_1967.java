package Strings;

public class _1967 {
    public static void main(String[] args) {
        String[] arr = {"a","a","a"};
        String str = "ab";
        System.out.println(numOfStrings(arr, str));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String str : patterns) {
            if (word.contains(str)) {
                count++;
            }
        }
        return count;
    }
}
