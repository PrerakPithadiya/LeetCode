import java.util.Arrays;
public class _821{
    public static void main(String[] args){
        String str = "aaab";
        char ch = 'b';
        System.out.println(Arrays.toString(shortestToChar(str, ch)));
    }
    public static int[] shortestToChar(String s, char c){
        int n = s.length();
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int leftDistance = leftSide(i, s, c);
            leftDistance = (leftDistance == -1) ? Integer.MAX_VALUE : i - leftDistance;
            int rightDistance = rightSide(i, s, c);
            rightDistance = (rightDistance == -1) ? Integer.MAX_VALUE : rightDistance - i;
            ans[i] = Math.min(leftDistance, rightDistance);
        }
        return ans;
    }
    public static int leftSide(int n, String s, char ch){
        for(int i = n; i >= 0; i--){
            if(s.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }
    public static int rightSide(int n, String s, char ch){
        for(int i = n; i < s.length(); i++){
            if(s.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }
}