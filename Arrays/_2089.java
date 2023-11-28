import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class _2089{
    public static void main(String[] args){
        int arr[] = {1,2,5,2,3};
        int target = 5;
        System.out.println(targetIndices(arr, target));
    }
    public static List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}