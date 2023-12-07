import java.util.Arrays;
public class _1502{
    public static void main(String[] args){
        int arr[] = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr){
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        int n = arr.length;
        for(int i = 1; i < n - 1; i++){
            if(!(arr[i + 1] - arr[i] == diff)){
                return false;
            }
        }
        return true;
    }
}