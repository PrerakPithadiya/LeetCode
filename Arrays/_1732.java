public class _1732{
    public static void main(String[] args){
        int arr[] = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain){
        int max = 0, sum = 0;
        for(int element : gain){
            sum += element;
            max = (max < sum) ? sum : max;
        }
        return max;
    }
}