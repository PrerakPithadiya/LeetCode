import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class _1313{
    public static void main(String[] args){
        int arr[] = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }
    public static int[] decompressRLElist(int[] arr){
        List<Integer> list = new ArrayList<>();
        int freq = 0, val = 0, n = arr.length;
        for(int i = 0; i < n - 1; i++){
            freq = arr[i];
            val = arr[i + 1];
            addElements(freq, val, list);
            i++;
        }
        n = list.size();
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void addElements(int freq, int val, List<Integer> list){
        for(int i = 1; i <= freq; i++){
            list.add(val);
        }
    }
}