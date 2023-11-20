import java.util.ArrayList;
import java.util.List;
public class _1431{
    public static void main(String[] args){
        int arr[] = {12,1,12};
        int n = 10;
        System.out.println(kidsWithCandies(arr, n));
    }
    public static List<Boolean> kidsWithCandies(int[] arr, int extra){
        List<Boolean> ans = new ArrayList<Boolean>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] += extra;
            ans.add(true);
            for(int j = 0; j < n; j++){
                if(i != j && arr[i] < arr[j]){   
                    ans.set(i, false);
                    break;
                }
            }
            arr[i] -= extra;
        }
        return ans;
    }
}