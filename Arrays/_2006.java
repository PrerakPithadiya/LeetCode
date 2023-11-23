public class _2006{
    public static void main(String[] args){
        int arr[] = {3,2,1,5,4};
        int k = 2;
        System.out.println(countKDifference(arr, k));
    }
    public static int countKDifference(int[] nums, int k) {
        int count = 0, n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(Math.abs(nums[i] - nums[j]) == k){   
                    count++;
                }
            }
        }
        return count;
    }
}