public class _2562{
    public static void main(String[] args){
        int arr[] = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(arr));
    }
    public static long findTheArrayConcVal(int[] arr){
        int n = arr.length, i = 0, j = n - 1;
        long result = 0;
        if((n & 1) == 1){
            result += arr[n / 2];
        }
        while(i < j){
            String ans = "" + arr[i] + arr[j];
            result += Long.parseLong(ans);
            i++;
            j--;
        }
        return result;
    }
}