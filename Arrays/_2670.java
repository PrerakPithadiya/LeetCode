import java.util.HashSet;
import java.util.Arrays;
public class _2670{
    public static void main(String[] args){
        int arr[] = {3,2,3,4,2};
        System.out.println(Arrays.toString(distinctDifferenceArray(arr)));
    }
    public static int[] distinctDifferenceArray(int[] arr){
        int n = arr.length;
        int result[] = new int[n];
        for(int i = 0; i < n; i++){
            int ans1 = countDistinct(0, i, arr);
            int ans2 = countDistinct(i + 1, n - 1, arr);
            result[i] = ans1 - ans2;
        }
        return result;
    }
    public static int countDistinct(int start, int end, int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = start; i <= end; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}