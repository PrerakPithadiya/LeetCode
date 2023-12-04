public class _2529{
    public static void main(String[] args){
        int arr[] = {5,20,66,1314};
        System.out.println(maximumCount(arr));
    }
    public static int maximumCount(int[] arr){
        int pos = 0, neg = 0;
        for(int element : arr){
            if(element > 0){
                pos++;
            } else if(element < 0){
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}