import java.lang.StringBuilder;
public class _2108{
    public static void main(String[] args){
        String arr[] = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(arr));
    }
    public static String firstPalindrome(String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}