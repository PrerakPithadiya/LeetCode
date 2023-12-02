import java.util.Arrays;
public class _977{
    public static void main(String[] args){
        int arr[] = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] *= arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}