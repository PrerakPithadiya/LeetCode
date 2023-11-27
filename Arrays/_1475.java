import java.util.Arrays;
public class _1475{
    public static void main(String[] args){
        int arr[] = {10,1,1,6};
        System.out.println(Arrays.toString(finalPrices(arr)));
    }
    public static int[] finalPrices(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] >= arr[j]){
                    arr[i] = arr[i] - arr[j];
                    break;
                }
            }
        }
        return arr;
    }
}