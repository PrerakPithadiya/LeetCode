import java.util.Arrays;
public class _1051{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(heightChecker(arr));
    }
    public static int heightChecker(int[] heights){
        int expected[] = heights.clone();
        Arrays.sort(expected);
        int n = heights.length, count = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}