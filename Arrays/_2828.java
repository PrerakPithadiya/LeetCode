import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Arrays;
public class _2828{
    public static void main(String[] args){
        List<String> arr = new ArrayList<>(Arrays.asList("never","gonna","give","up","on","you"));
        String str = "ngguoy";
        System.out.println(isAcronym(arr, str));
    }
    public static boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(str.charAt(0));
        }
        return sb.toString().equals(s);
    }
}