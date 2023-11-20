import java.util.Arrays;
public class _1{
    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}