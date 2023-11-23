public class _1588{
    public static void main(String[] args){
        int arr[] = {10,11,12};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr){
        int mainSum = 0, sum = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j += 2){
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                mainSum += sum;
                sum = 0;
            }
        }
        return mainSum;
    }
}