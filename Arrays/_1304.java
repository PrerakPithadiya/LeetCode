import java.util.Arrays;
public class _1304{
    public static void main(String[] args){
        int n = 1;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n){
        if(n == 1){
            return new int[]{ 0 };
        } else if(n == 2){
            return new int[]{ 1, -1 };
        } else if(n == 3){
            return new int[]{ 1, 0, -1 };
        }
        int arr[] = new int[n];
        int val = 1;
        if((n & 1) == 1){
            arr[n - 1] = 0;
            n--;
        }
        for(int i = 0; i < n; i += 2){
            arr[i] = val;
            arr[i + 1] = -val;
            val++;
        }
        return arr;
    }
}