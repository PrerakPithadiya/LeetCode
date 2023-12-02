public class _136{
    public static void main(String[] args){
        int arr[] = {1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] arr){
        int n = arr.length, ans = arr[0];
        for(int i = 1; i < n; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}