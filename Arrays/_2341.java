import java.util.Arrays;
public class _2341{
    public static void main(String[] args){
        int arr[] = {0};
        System.out.println(Arrays.toString(numberOfPairs(arr)));
    }
    public static int[] numberOfPairs(int[] arr){
        int n = arr.length, size = n, pairs = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] == -1){
                continue;
            }
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    pairs++;
                    size -= 2;
                    arr[i] = arr[j] = -1;
                    break;
                }
            }
        }
        return new int[]{ pairs, size };
    }
}