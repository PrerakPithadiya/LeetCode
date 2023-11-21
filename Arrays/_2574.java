import java.util.Arrays;
public class _2574{
    public static void main(String[] args){
        int arr[] = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }
    public static int[] leftRightDifference(int[] arr){
        if(arr.length == 1){
            return new int[]{0};
        }
        int n = arr.length, i = 0, j = n - 1, sum1 = 0, sum2 = 0;
        int pref[] = new int[n];
        int suff[] = new int[n];
        while(i < n){
            sum1 += arr[i];
            pref[i] = sum1;
            sum2 += arr[j];
            suff[j] = sum2;
            i++;
            j--;
        }
        arr[0] = suff[1];
        arr[n - 1] = pref[n - 2];
        for(i = 1; i < n - 1; i++){
            int leftSum = pref[i - 1];
            int rightSum = suff[i + 1];
            int res = leftSum - rightSum;
            res = (res < 0) ? res * -1 : res;
            arr[i] = res;
        }
        return arr;
    }
}