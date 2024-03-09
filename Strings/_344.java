package Strings;

import java.util.Arrays;

public class _344 {
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        reverse(str);
        System.out.println(Arrays.toString(str));
    }

    public static void reverse(char[] str) {
        int i = 0, j = str.length - 1;
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}