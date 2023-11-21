import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class _1389{
    public static void main(String[] args){
        int arr[] = {1};
        int brr[] = {0};
        System.out.println(Arrays.toString(createTargetArray(arr, brr)));
    }
    public static int[] createTargetArray(int[] arr, int[] index) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            list.add(index[i], arr[i]);
        }
        for(int i = 0; i < n; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}