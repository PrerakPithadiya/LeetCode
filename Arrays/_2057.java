public class _2057{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(smallestEqual(arr));
    }   
    public static int smallestEqual(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(i % 10 == arr[i]){
                return i;
            }
        }
        return -1;
    }
}