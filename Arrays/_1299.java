import java.util.Arrays;
public class _1299{
    public static void main(String[] args){
        int arr[] = {400};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i + 1; j < n; j++){
                max = (max < arr[j]) ? arr[j] : max;
            }
            arr[i] = max;
        }
        arr[n - 1] = -1;
        return arr;
    }
}