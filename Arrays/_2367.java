public class _2367{
    public static void main(String[] args){
        int arr[] = {0,1,4,6,7,10};
        int num = 3;
        System.out.println(arithmeticTriplets(arr, num));
    }
    public static int arithmeticTriplets(int[] arr, int diff) {
        int count = 0, n = arr.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[j] - arr[i] == diff){
                        if(arr[k] - arr[j] == diff){
                            count++;
                        }
                    } else{
                        break;
                    }
                }
            }
        }
        return count;
    }
}