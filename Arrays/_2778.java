public class _2778{
    public static void main(String[] args){
        int arr[] = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(arr));
    }
    public static int sumOfSquares(int[] arr){
        int n = arr.length, sum = 0;
        for(int i = 0; i < n; i++){
            if(n % (i + 1) == 0){
                sum += (arr[i] * arr[i]);
            }
        }
        return sum;
    }
}