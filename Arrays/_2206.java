public class _2206{
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        System.out.println(divideArray(arr));
    }
    public static boolean divideArray(int[] arr){
        int n = arr.length, pairs = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] == -1){
                continue;
            }
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    pairs++;
                    arr[i] = arr[j] = -1;
                    break;
                }
            }
        }
        return pairs == (n / 2);
    }
}