import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class _2824{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int n = -2;
        System.out.println(countPairs(list, n));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int n = nums.size(), count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
    }
}