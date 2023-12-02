import java.util.Arrays;
public class _496{
    public static void main(String[] args){
        int arr[] = {2,4};
        int brr[] = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(arr, brr)));
    }
    public static int[] nextGreaterElement(int[] arr, int[] brr){
        int n = arr.length, m = brr.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i] == brr[j]){
                    ans[i] = findNextGreater(brr[j], j + 1, brr);
                    break;
                }
            }
        }
        return ans;
    }
    public static int findNextGreater(int target, int start, int arr[]){
        int n = arr.length;
        for(int i = start; i < n; i++){
            if(target < arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}