public class _2656{
    public static void main(String[] args){
        int arr[] = {5,5,5};
        int count = 2;
        System.out.println(maximizeSum(arr, count));
    }
    public static int maximizeSum(int[] arr, int k){
        int max = -1, n = arr.length, index = -1, score = 0;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        while(k != 0){
            score += arr[index];
            arr[index] += 1;
            k--;
        }
        return score;
    }
}