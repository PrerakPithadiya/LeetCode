import java.util.Arrays;
public class _1480{
    public static void main(String[] args){
        int arr[] = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] arr) {
        int sum = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }
}