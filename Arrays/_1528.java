import java.lang.StringBuilder;
public class _1528{
    public static void main(String[] args){
        String str = "abc";
        int arr[] = {0,1,2};
        System.out.println(restoreString(str, arr));
    }
    public static String restoreString(String s, int[] index) {
        int n = index.length;
        char ans[] = new char[n];
        for(int i = 0; i < n; i++){
            ans[index[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : ans){
            sb.append(ch);
        }
        return sb.toString();
    }
}