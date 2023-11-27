import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class _2553{
    public static void main(String[] args){
        int arr[] = {7,1,3,9};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }
    public static int[] separateDigits(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for(int n : arr){
            if(n < 10){
                ans.add(n);
            } else if(n < 100){
                ans.add(n / 10);
                ans.add(n % 10);
            } else if(n < 1000){
                ans.add(n / 100);
                ans.add(n / 10 % 10);
                ans.add(n % 10);
            } else{
                separateNumber(Integer.toString(n), ans);
            }
        }
        int n = ans.size();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static void separateNumber(String str, List<Integer> ans){
        int n = str.length();
        for(int i = 0; i < n; i++){
            ans.add(str.charAt(i) - 48);
        }
    }
}