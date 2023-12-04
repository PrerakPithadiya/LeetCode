public class _2154{
    public static void main(String[] args){
        int arr[] = {2,7,9};
        int target = 4;
        System.out.println(findFinalValue(arr, target));
    }
    public static int findFinalValue(int[] arr, int original){
        while(isPresent(arr, original)){
            original *= 2;
        }
        return original;
    }
    public static boolean isPresent(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}