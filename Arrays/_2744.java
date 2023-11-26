import java.lang.StringBuilder;
public class _2744{
    public static void main(String[] args){
        String arr[] = {"ab","ba","cc"};       
        System.out.println(maximumNumberOfStringPairs(arr));
    }
    public static int maximumNumberOfStringPairs(String[] arr){
        int n = arr.length, count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n - 1; i++){
            sb.append(arr[i]);
            sb.reverse();
            arr[i] = sb.toString();
            sb.delete(0, sb.length());
            for(int j = i + 1; j < n; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}