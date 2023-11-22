import java.lang.StringBuilder;
public class _1816{
    public static void main(String[] args){
        String str = "chopper is not a tanuki";
        int words = 5;
        System.out.println(truncateSentence(str, words));
    }
    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0, n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                count++;
            } if(count == k){
                return sb.toString();
            }
            sb.append(ch);
        }
        return s;
    }
}