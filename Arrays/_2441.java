import java.lang.StringBuilder;
import java.util.Arrays;
public class _1002{
	public static void main(String[] args){
		int arr[] = {-48, 1, 25, 31, 38, 43, 48};
		System.out.println(findMaxK(arr));
	}
	public static int findMaxK(int[] arr) {
        Arrays.sort(arr);
		int n = arr.length;
        if(arr[n - 1] < 0){
            return -1;
        }
		int mid = findIndex(arr);
		if(mid == -1){
            if(arr[0] < 0){
                mid = 0;
            } else{
			    return -1;
            }
		}
		for(int i = n - 1; i >= mid + 1; i--){
			if(isPresent(arr, mid, -arr[i])){
				return arr[i];
			}
		}
		return -1;
    }
    public static boolean isPresent(int arr[], int n, int target){
		int start = 0, end = n;
		while(start <= end){
			int mid = (start + end) / 2;
			if(arr[mid] == target){
				return true;
			} else if(arr[mid] < target){
				start = mid + 1;
			} else{
				end = mid - 1;
			}
		}
		return false;
	}
	public static int findIndex(int arr[]){
		int n = arr.length;
		int start = 0, end = n - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			if(0 < mid && mid < n - 1){
				if(arr[mid - 1] < 0 && arr[mid + 1] > 0 && arr[mid] < 0){
					return mid;
				} else if(arr[mid - 1] < 0 && arr[mid + 1] < 0){
					start = mid;
				} else{
					end = mid;
				}
			} else{
				return -1;
			}
		}
		return -1;
	}
}