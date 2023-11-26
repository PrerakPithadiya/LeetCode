public class _2176{
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        int num = 1;
        System.out.println(countPairs(arr, num));
    }
    public static int countPairs(int[] arr, int k) {
        int n = arr.length, count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[i] == arr[j]) && ((i * j) % k == 0)){
                    count++;
                }
            }
        }
        return count;
    }
}