import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class _500{
    public static void main(String[] args){
        String arr[] = {"adsdf","sfd"};
        System.out.println(Arrays.toString(findWords(arr)));
    }
    public static String[] findWords(String[] words){
        List<String> ans = new ArrayList<>();
        for(String str : words){
            if(isInSingleLine(str, "qwertyuiopQWERTYUIOP")){
                ans.add(str);
                continue;
            } if(isInSingleLine(str, "asdfghjklASDFGHJKL")){
                ans.add(str);
                continue;
            } if(isInSingleLine(str, "zxcvbnmZXCVBNM")){
                ans.add(str);
            }
        }
        int n = ans.size(), k = 0;
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            arr[k++] = ans.get(i);
        }
        return arr;
    }
    public static boolean isInSingleLine(String str, String line){
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(!line.contains(ch + "")){
                return false;
            }
        }
        return true;
    }
}