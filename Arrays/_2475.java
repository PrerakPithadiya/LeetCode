public class _2475{
    public static void main(String[] args){
        int arr[] = {1,1,1,1,1};
        System.out.println(unequalTriplets(arr));
    }
    public static int unequalTriplets(int[] arr){
        int n = arr.length, count = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                if(arr[i] == arr[j]){
                    continue;
                }
                for(int k = j + 1; k < n; k++){
                    if(
                        arr[i] != arr[j] &&
                        arr[i] != arr[k] &&
                        arr[j] != arr[k]
                    ){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}