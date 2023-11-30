import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class _2788{
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("|||"));
        char ch = '|';
        System.out.println(splitWordsBySeparator(list, ch));
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator){
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            int n = str.length();
            for(int i = 0; i < n; i++){
                if(str.charAt(i) == separator){
                    if(sb.length() != 0){
                        ans.add(sb.toString());
                        sb.delete(0, sb.length());
                    }
                } else{
                    sb.append(str.charAt(i));
                }
            }
            if(sb.length() != 0){
                ans.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        return ans;
    }
}