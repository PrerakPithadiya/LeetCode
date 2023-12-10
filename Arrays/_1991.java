public class _1991{
	public static void main(String[] args){
		int arr[] = {2,5};
		System.out.println(findMiddleIndex(arr));
	}
	public static int findMiddleIndex(int[] arr){
        int n = arr.length;
        int pref[] = new int[n];
        int suff[] = new int[n];
        createArray(pref, suff, arr);
        if(suff[1] == 0){
        	return 0;
        }
        for(int i = 1; i < n - 1; i++){
        	int part1 = pref[i - 1];
        	int part2 = suff[i + 1];
        	if(part1 == part2){
        		return i;
        	}
        }
        if(pref[n - 2] == 0){
        	return n - 1;
        }
        return -1;
    }
    public static void createArray(int pref[], int suff[], int arr[]){
    	int n = arr.length, i = 0, j = n - 1, sum1 = 0, sum2 = 0;
    	while(i < n){
    		sum1 += arr[i];
    		pref[i] = sum1;
    		sum2 += arr[j];
    		suff[j] = sum2;
    		i++;
    		j--;
    	}
    }
}