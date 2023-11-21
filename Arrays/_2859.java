import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class _2859{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(4,3,2,1));
        int num = 2;
        System.out.println(sumIndicesWithKSetBits(list, num));
    }
    public static int sumIndicesWithKSetBits(List<Integer> arr, int k){
        int n = arr.size(), sum = 0;
        for(int i = 0; i < n; i++){
            if(isEqualSetBits(i, k)){
                sum += arr.get(i);
            }
        }
        return sum;
    }
    public static boolean isEqualSetBits(int n, int k){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count == k;
    }
}