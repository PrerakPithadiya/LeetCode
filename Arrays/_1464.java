public class _1464{
    public static void main(String[] args){
        int arr[] = {3,7};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] arr){
        int max = 0, ans = 0, n = arr.length;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] - 1 == 0){
                continue;
            }
            for(int j = i + 1; j < n; j++){
                ans = (arr[i] - 1) * (arr[j] - 1);
                max = (max < ans) ? ans : max;
            }
        }
        return max;
    }
}