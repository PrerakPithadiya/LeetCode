import java.util.Arrays;
public class _338{
    public static void main(String[] args){
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n){
        int ans[] = new int[n + 1];
        for(int i = 0; i <= n; i++){
            ans[i] = countSetBits(i);
        }
        return ans;
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}