public class _1385{
	public static void main(String[] args){
		int arr[] = {2,1,100,3};
		int brr[] = {-5,-2,10,-3,7};
		int num = 6;
		System.out.println(findTheDistanceValue(arr, brr, num));
	}
	public static int findTheDistanceValue(int[] arr1, int[] arr2, int d){
        int n = arr1.length, m = arr2.length, count = 0;
        for(int i = 0; i < n; i++){
        	boolean ans = true;
        	for(int j = 0; j < m; j++){
        		if(Math.abs(arr1[i] - arr2[j]) <= d){
        			ans = false;
        			break;
        		}
        	}
        	if(ans){
        		count++;
        	}
        }
        return count;
    }
}